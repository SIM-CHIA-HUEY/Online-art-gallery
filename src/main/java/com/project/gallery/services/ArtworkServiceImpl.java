package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;
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


    public ArtworkServiceImpl (ArtworkRepository artworkRepo, AvailabilitiesRepository availabilitiesRepo, CategoriesRepository categoriesRepo){

        this.artworkRepo = artworkRepo ;
        this.availabilitiesRepo = availabilitiesRepo ;
        this.categoriesRepo = categoriesRepo ;
    }


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



}
