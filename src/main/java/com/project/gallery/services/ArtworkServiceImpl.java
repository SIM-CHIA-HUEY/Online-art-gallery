package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.entities.Artwork;
import com.project.gallery.repositories.ArtworkRepository;
import org.springframework.stereotype.Service;


@Service
public class ArtworkServiceImpl implements ArtworkService {

    private final ArtworkRepository artworkRepo ;

    public ArtworkServiceImpl (ArtworkRepository artworkRepo){
        this.artworkRepo = artworkRepo ;
    }

    @Override
    public void create (ArtworkCreate input){
        Artwork artworkEntity = new Artwork();
        artworkEntity.setTitle(input.getTitle());
        artworkEntity.setDescription(input.getDescription());
        artworkEntity.setPrice(input.getPrice());
        artworkEntity.setPublic(input.isPublic());
        artworkEntity.setProductionQuantity(input.getProductionQuantity());

        artworkRepo.save(artworkEntity);
    }



}
