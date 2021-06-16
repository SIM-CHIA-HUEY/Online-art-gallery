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

        Long categoriesCodeOne = input.getCategoryCodeOne();
        Categories categoriesFirst = categoriesRepo.getOne(categoriesCodeOne);
        artworkEntity.setCategoryOne(categoriesFirst);

        Long categoriesCodeTwo = input.getCategoryCodeTwo();
        Categories categoriesSecond = categoriesRepo.getOne(categoriesCodeTwo);
        artworkEntity.setCategoryTwo(categoriesSecond);

        Long categoriesCodeThree = input.getCategoryCodeThree();
        Categories categoriesThird = categoriesRepo.getOne(categoriesCodeThree);
        artworkEntity.setCategoryThree(categoriesThird);

        Long availabilitiesCode = input.getAvailabilitiesCode(); //availabilitesCOde / availbilitiesID ?
        Availabilities availabilities = availabilitiesRepo.getOne(availabilitiesCode);
        artworkEntity.setAvailabilities(availabilities);

        artworkRepo.save(artworkEntity);


    }



    }
