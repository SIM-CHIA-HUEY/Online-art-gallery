package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.dtos.ArtworkUpdate;
import com.project.gallery.domain.dtos.ArtworkView;
import com.project.gallery.domain.entities.Artwork;
import com.project.gallery.domain.entities.Availabilities;
import com.project.gallery.domain.entities.Categories;
import com.project.gallery.repositories.ArtworkRepository;
import com.project.gallery.repositories.AvailabilitiesRepository;
import com.project.gallery.repositories.CategoriesRepository;
import org.springframework.stereotype.Service;


@Service
public class ArtworkServiceImpl implements ArtworkService {

    private final ArtworkRepository artworkRepo ;
    private final AvailabilitiesRepository availabilitiesRepo ;
    private final CategoriesRepository categoriesRepo ;


    public ArtworkServiceImpl (ArtworkRepository artworkRepo, AvailabilitiesRepository availabilitiesRepo,
                               CategoriesRepository categoriesRepo){
        this.artworkRepo = artworkRepo ;
        this.availabilitiesRepo = availabilitiesRepo ;
        this.categoriesRepo = categoriesRepo ;
    }

    @Override
    public void create (ArtworkCreate input){
        Artwork artworkEntity = new Artwork();
        artworkEntity.setTitle(input.getTitle());
        artworkEntity.setDescription(input.getDescription());
        artworkEntity.setPrice(input.getPrice());
        artworkEntity.setPublic(input.isPublic());
        artworkEntity.setProductionQuantity(input.getProductionQuantity());

        Long CategoriesIdOne = input.getCategoryCodeOne();
        Categories categoriesCodeOne = categoriesRepo.getOne(CategoriesIdOne);
        artworkEntity.setCategoryCodeOne(categoriesCodeOne);

        Long CategoriesIdTwo = input.getCategoryCodeTwo();
        Categories categoriesCodeTwo = categoriesRepo.getOne(CategoriesIdTwo);
        artworkEntity.setCategoryCodeTwo(categoriesCodeTwo);

        Long CategoriesIdThree = input.getCategoryCodeThree();
        Categories categoriesCodeThree = categoriesRepo.getOne(CategoriesIdThree);
        artworkEntity.setCategoryCodeThree(categoriesCodeThree);

        Long AvailabilitiesId = input.getAvailabilitiesId();
        Availabilities availabilities = availabilitiesRepo.getOne(AvailabilitiesId);
        artworkEntity.setAvailabilitiesId(availabilities);

        artworkRepo.save(artworkEntity);
    }

    @Override
    public ArtworkView getById (Long id){
        Artwork artworkEntity = artworkRepo.findById(id).get();
        ArtworkView viewSearchedArtwork = new ArtworkView();
        viewSearchedArtwork.setTitle(artworkEntity.getTitle());
        viewSearchedArtwork.setDescription(artworkEntity.getDescription());
        viewSearchedArtwork.setPrice(artworkEntity.getPrice());
        viewSearchedArtwork.setPublic(artworkEntity.isPublic());
        viewSearchedArtwork.setProductionQuantity(artworkEntity.getProductionQuantity());
        viewSearchedArtwork.setCategoryOne(artworkEntity.getCategoryCodeOne());
        viewSearchedArtwork.setCategoryTwo(artworkEntity.getCategoryCodeTwo());
        viewSearchedArtwork.setCategoryThree(artworkEntity.getCategoryCodeThree());
        viewSearchedArtwork.setAvailabilities(artworkEntity.getAvailabilitiesId());
        return viewSearchedArtwork;
    }

    // get all artworks by artist name / pseudonym / id + budget + category + availabilities +
    /*
    getAll() {
        artworkRepo.findAll();
    }
    public ArtworkView getAllWork() {
        Artwork artwork = artworkRepo.findAll();
        ArtworkView view = new ArtworkView();
        view.findAll(ArtworkView.getAll);
        return view;
    }

     */

    @Override
    public void updateArtworkTitle(Long id, ArtworkUpdate artworkUpdate){
        Artwork updateArtworkEntity = artworkRepo.findById(id).get();
        updateArtworkEntity.setTitle(artworkUpdate.getTitle());
        updateArtworkEntity.setDescription(artworkUpdate.getDescription());
        updateArtworkEntity.setPrice(artworkUpdate.getPrice());
        updateArtworkEntity.setPublic(artworkUpdate.isPublic());
        updateArtworkEntity.setProductionQuantity(artworkUpdate.getProductionQuantity());
        updateArtworkEntity.setCategoryCodeOne(artworkUpdate.getCategoryOne());
        updateArtworkEntity.setCategoryCodeTwo(artworkUpdate.getCategoryTwo());
        updateArtworkEntity.setCategoryCodeThree(artworkUpdate.getCategoryThree());
        artworkRepo.save(updateArtworkEntity);
    }

    public void deleteArtworkById(Long artworkId) {
        artworkRepo.deleteById(artworkId);
    }
}
