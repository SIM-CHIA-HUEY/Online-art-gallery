package com.project.gallery.services;


import com.project.gallery.domain.dtos.AccountCreate;
import com.project.gallery.domain.entities.UserAccount;
import com.project.gallery.domain.entities.UserRole;
import com.project.gallery.repositories.AccountsRepository;
import com.project.gallery.repositories.RolesRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService  {

    private final PasswordEncoder encoder ;
    //private final TokenProvider provider ;
    private final AccountsRepository accountsRepo;
    private final RolesRepository rolesRepo;

    // ,TokenProvider provider, RoleRepository roles
    public AuthenticationServiceImpl (PasswordEncoder encoder, AccountsRepository accountsRepo, RolesRepository rolesRepo){
        this.encoder = encoder;
        //this.provider = provider;
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

}
