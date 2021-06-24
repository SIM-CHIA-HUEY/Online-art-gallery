package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.dtos.ArtworkUpdate;
import com.project.gallery.domain.dtos.ArtworkView;
import com.project.gallery.domain.entities.Artworks;
import com.project.gallery.domain.entities.Availabilities;
import com.project.gallery.domain.entities.Categories;
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

    public ArtworksServiceImpl(ArtworksRepository artworkRepo, AvailabilitiesRepository availabilitiesRepo,
                               CategoriesRepository categoriesRepo){
        this.artworkRepo = artworkRepo ;
        this.availabilitiesRepo = availabilitiesRepo ;
        this.categoriesRepo = categoriesRepo ;
    }

    @Override
    public void create (ArtworkCreate newArtwork){
        Artworks artworksEntity = new Artworks();
        artworksEntity.setTitle(newArtwork.getTitle());
        artworksEntity.setDescription(newArtwork.getDescription());
        artworksEntity.setPrice(newArtwork.getPrice());
        artworksEntity.setPublic(newArtwork.isPublic());
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

        artworkRepo.save(artworksEntity);
    }

    @Override
    public ArtworkView getById (Long id){
        Artworks artworksEntity = artworkRepo.findById(id).get();
        // How to view this artwork's categories list : category codes and names ?

        ArtworkView viewSearchedArtwork = new ArtworkView();
        viewSearchedArtwork.setTitle(artworksEntity.getTitle());
        viewSearchedArtwork.setDescription(artworksEntity.getDescription());
        viewSearchedArtwork.setPrice(artworksEntity.getPrice());
        viewSearchedArtwork.setPublic(artworksEntity.isPublic());
        viewSearchedArtwork.setProductionQuantity(artworksEntity.getQuantity());
        //viewSearchedArtwork.setCategoriesList(...get);

        viewSearchedArtwork.setAvailabilities(artworksEntity.getAvailabilities());
        return viewSearchedArtwork;
    }

    @Override
    public void updateArtwork(Long id, ArtworkUpdate artworkUpdateInput){
        Artworks updateArtworks = artworkRepo.findById(id).get();

        if(!artworkUpdateInput.getTitle().equals(updateArtworks.getTitle())){
            updateArtworks.setTitle(artworkUpdateInput.getTitle());
        } else if(!artworkUpdateInput.getDescription().equals(updateArtworks.getDescription())){
            updateArtworks.setDescription(artworkUpdateInput.getDescription());
        } else if(artworkUpdateInput.getPrice() != updateArtworks.getPrice()){
            updateArtworks.setPrice(artworkUpdateInput.getPrice());
        } else if(! artworkUpdateInput.isPublic() == updateArtworks.isPublic()){
            updateArtworks.setPublic(artworkUpdateInput.isPublic());
        } else if(artworkUpdateInput.getQuantity() != updateArtworks.getQuantity()){
            updateArtworks.setQuantity(artworkUpdateInput.getQuantity());
        }

        artworkRepo.save(updateArtworks);
    }

    public void deleteArtworkById(Long artworkId) {
        artworkRepo.deleteById(artworkId);
    }
}
