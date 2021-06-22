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

        Long CategoriesIdOne = newArtwork.getCategoryOne();
        Categories categoriesCodeOne = categoriesRepo.getOne(CategoriesIdOne);
        artworksEntity.setCategoryOne(categoriesCodeOne);

        Long CategoriesIdTwo = newArtwork.getCategoryTwo();
        Categories categoriesCodeTwo = categoriesRepo.getOne(CategoriesIdTwo);
        artworksEntity.setCategoryTwo(categoriesCodeTwo);

        Long CategoriesIdThree = newArtwork.getCategoryThree();
        Categories categoriesCodeThree = categoriesRepo.getOne(CategoriesIdThree);
        artworksEntity.setCategoryThree(categoriesCodeThree);

        Long AvailabilitiesId = newArtwork.getAvailabilities();
        Availabilities availabilities = availabilitiesRepo.getOne(AvailabilitiesId);
        artworksEntity.setAvailabilities(availabilities);

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
        viewSearchedArtwork.setCategoryOne(artworksEntity.getCategoryOne());
        viewSearchedArtwork.setCategoryTwo(artworksEntity.getCategoryTwo());
        viewSearchedArtwork.setCategoryThree(artworksEntity.getCategoryThree());
        viewSearchedArtwork.setAvailabilities(artworksEntity.getAvailabilities());
        return viewSearchedArtwork;
    }

    @Override
    public void updateArtwork(Long id, ArtworkUpdate artworkUpdate){
        Artworks updateArtworksTitle = artworkRepo.findById(id).get();
        updateArtworksTitle.setTitle(artworkUpdate.getTitle());
        /*
      updateArtworkDescription.setDescription(artworkUpdate.getDescription());
        updateArtworkEntity.setPrice(artworkUpdate.getPrice());
        updateArtworkEntity.setPublic(artworkUpdate.isPublic());
        updateArtworkEntity.setProductionQuantity(artworkUpdate.getProductionQuantity());
        updateArtworkEntity.setCategoryCodeOne(artworkUpdate.getCategoryOne());
        updateArtworkEntity.setCategoryCodeTwo(artworkUpdate.getCategoryTwo());
        updateArtworkEntity.setCategoryCodeThree(artworkUpdate.getCategoryThree());
 */
        artworkRepo.save(updateArtworksTitle);
    }

    public void deleteArtworkById(Long artworkId) {
        artworkRepo.deleteById(artworkId);
    }
}
