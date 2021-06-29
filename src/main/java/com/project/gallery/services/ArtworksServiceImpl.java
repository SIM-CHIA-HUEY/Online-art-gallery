package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.dtos.ArtworkUpdate;
import com.project.gallery.domain.dtos.ArtworkView;
import com.project.gallery.domain.entities.Artworks;
import com.project.gallery.domain.entities.Availabilities;
import com.project.gallery.domain.entities.Categories;
import com.project.gallery.domain.entities.UserAccount;
import com.project.gallery.repositories.AccountsRepository;
import com.project.gallery.repositories.ArtworksRepository;
import com.project.gallery.repositories.AvailabilitiesRepository;
import com.project.gallery.repositories.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtworksServiceImpl implements ArtworksService {

    private final ArtworksRepository artworkRepo ;
    private final AvailabilitiesRepository availabilitiesRepo ;
    private final CategoriesRepository categoriesRepo ;
    private final AccountsRepository accountsRepo ;

    public ArtworksServiceImpl(ArtworksRepository artworkRepo, AvailabilitiesRepository availabilitiesRepo,
                               CategoriesRepository categoriesRepo, AccountsRepository accountsRepo){
        this.artworkRepo = artworkRepo ;
        this.availabilitiesRepo = availabilitiesRepo ;
        this.categoriesRepo = categoriesRepo ;
        this.accountsRepo = accountsRepo ;
    }

    @Override
    public void create (ArtworkCreate newArtwork){
        Artworks artworksEntity = new Artworks();
        artworksEntity.setTitle(newArtwork.getTitle());
        artworksEntity.setDescription(newArtwork.getDescription());
        artworksEntity.setPrice(newArtwork.getPrice());
        artworksEntity.setPublic(true);
        artworksEntity.setQuantity(newArtwork.getQuantity());

        List<Long> categoriesInputs = newArtwork.getCategoriesList();
        List<Categories> categoriesList = new ArrayList<Categories>();
        for(Long categoryCode : categoriesInputs){
            Categories category = categoriesRepo.findById(categoryCode).get();
            categoriesList.add(category);
        }
        artworksEntity.setCategoriesList(categoriesList);

        Long AvailabilitiesId = newArtwork.getAvailabilities();
        Availabilities availabilities = availabilitiesRepo.getOne(AvailabilitiesId);
        artworksEntity.setAvailabilities(availabilities);

        Long UserId = newArtwork.getUserId();
        UserAccount user = accountsRepo.getOne(UserId);
        artworksEntity.setUserId(user);

        artworkRepo.save(artworksEntity);
    }

    @Override
    public ArtworkView getById (Long id){
        Artworks artworksEntity = artworkRepo.findById(id).get();
        ArtworkView viewSearchedArtwork = new ArtworkView();
        viewSearchedArtwork.setTitle(artworksEntity.getTitle());
        viewSearchedArtwork.setDescription(artworksEntity.getDescription());
        viewSearchedArtwork.setPrice(artworksEntity.getPrice());
        viewSearchedArtwork.setPublic(artworksEntity.isPublic());
        viewSearchedArtwork.setProductionQuantity(artworksEntity.getQuantity());
        viewSearchedArtwork.setCategoriesList(artworksEntity.getCategoriesList());
        viewSearchedArtwork.setAvailabilities(artworksEntity.getAvailabilities());
        return viewSearchedArtwork;
    }

    @Override
    public void updateArtwork(Long id, ArtworkUpdate artworkUpdateInput){
        Artworks updateArtworks = artworkRepo.findById(id).get();

        updateArtworks.setTitle(artworkUpdateInput.getTitle());
        updateArtworks.setDescription(artworkUpdateInput.getDescription());
        updateArtworks.setPrice(artworkUpdateInput.getPrice());
        updateArtworks.setPublic(artworkUpdateInput.isPublic());
        updateArtworks.setQuantity(artworkUpdateInput.getQuantity());

        List<Long> categoriesInputsUpdate = artworkUpdateInput.getCategoriesList();
        List<Categories> categoriesListUpdate = new ArrayList<Categories>();
        for(Long categoryCode : categoriesInputsUpdate){
            Categories category = categoriesRepo.findById(categoryCode).get();
            categoriesListUpdate.add(category);
        } updateArtworks.setCategoriesList(categoriesListUpdate);

        Long AvailabilitiesId = artworkUpdateInput.getAvailabilities();
        Availabilities availabilities = availabilitiesRepo.getOne(AvailabilitiesId);
        updateArtworks.setAvailabilities(availabilities);

        artworkRepo.save(updateArtworks);
    }

    public void deleteArtworkById(Long artworkId) {
        artworkRepo.deleteById(artworkId);
    }
}
