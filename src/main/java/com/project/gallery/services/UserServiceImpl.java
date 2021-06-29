package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtistInfoCreate;
import com.project.gallery.domain.entities.ArtistInfo;
import com.project.gallery.domain.entities.UserAccount;
import com.project.gallery.repositories.AccountsRepository;
import com.project.gallery.repositories.ArtistInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final ArtistInfoRepository artistInfoRepo ;
    private final AccountsRepository accountsRepo ;


    public UserServiceImpl (ArtistInfoRepository artistInfoRepo, AccountsRepository accountsRepo ){
        this.artistInfoRepo = artistInfoRepo ;
        this.accountsRepo = accountsRepo ;
    }

    @Override
    public void artistCreate (ArtistInfoCreate artistInfoInputs){
        ArtistInfo artistInfoEntity = new ArtistInfo();
        artistInfoEntity.setAtelierIdentificationNo(artistInfoInputs.getAtelierIdentificationNo());
        artistInfoEntity.setPseudonym (artistInfoInputs.getPseudonym());
        artistInfoEntity.setFirstname (artistInfoInputs.getFirstname());
        artistInfoEntity.setLastname (artistInfoInputs.getLastname());
        artistInfoEntity.setDescription (artistInfoInputs.getDescription());
        artistInfoEntity.setAtelierAddress (artistInfoInputs.getAtelierAddress());
        artistInfoEntity.setAtelierTelephone (artistInfoInputs.getAtelierTelephone());

        Long UserId = artistInfoInputs.getUserId();
        UserAccount user = accountsRepo.getOne(UserId);
        artistInfoEntity.setUserId(user);

        artistInfoRepo.save(artistInfoEntity);

    }

}
