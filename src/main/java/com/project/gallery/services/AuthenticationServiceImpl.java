package com.project.gallery.services;


import com.project.gallery.domain.dtos.AccountCreate;
import com.project.gallery.domain.dtos.AccountLogin;
import com.project.gallery.domain.entities.UserAccount;
import com.project.gallery.domain.entities.UserRole;
import com.project.gallery.repositories.AccountsRepository;
import com.project.gallery.repositories.RolesRepository;
import com.project.gallery.security.BadCredentialsException;
import com.project.gallery.security.IdToken;
import com.project.gallery.security.TokenProvider;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationServiceImpl implements AuthenticationService  {

    private final PasswordEncoder encoder ;
    private final TokenProvider provider ;
    private final AccountsRepository accountsRepo;
    private final RolesRepository rolesRepo;

    public AuthenticationServiceImpl (PasswordEncoder encoder, TokenProvider provider,
            AccountsRepository accountsRepo, RolesRepository rolesRepo){
        this.encoder = encoder;
        this.provider = provider;
        this.accountsRepo = accountsRepo;
        this.rolesRepo = rolesRepo;
    }

    @Override
    public void create (AccountCreate inputs){
        UserAccount accountEntity = new UserAccount();

        accountEntity.setEmail(inputs.getEmail());

        String raw = inputs.getPassword();
        String encoded = encoder.encode(raw);
        accountEntity.setPassword(encoded);

        Long roleId = inputs.getRoleCode();
        UserRole role = rolesRepo.getOne(roleId);
        accountEntity.setRole(role);

        accountEntity.setActivated(true);

        accountsRepo.save(accountEntity);
    }

    @Override
    public IdToken login(AccountLogin credentialsInput) {
        String email = credentialsInput.getEmail();
        UserAccount userEntity = accountsRepo.findByEmailAndIsActivatedIsTrue(email)
                .orElseThrow(() -> new BadCredentialsException("email not found" + email));

        String encoded = userEntity.getPassword();
        String raw = credentialsInput.getPassword();
        if(!encoder.matches(raw, encoded)){
            throw new BadCredentialsException("bad password for email " + email);
        }
        List<String> authorities = List.of(userEntity.getRole().getRoleName());
        return provider.idToken(email, authorities);
    }

}
