package com.project.gallery.controllers;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.dtos.ArtworkUpdate;
import com.project.gallery.domain.dtos.ArtworkView;
import com.project.gallery.services.ArtworkService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/artworks")

public class ArtworkController {
    private final ArtworkService artworkService ;

    public ArtworkController (ArtworkService artworkService){
        this.artworkService = artworkService ;
    }

    @PostMapping
    public void createArtwork (@Valid @RequestBody ArtworkCreate newArtwork){
        artworkService.create(newArtwork);
    }

    @GetMapping("/{id}")
    public ArtworkView getById(@PathVariable("id") Long id){
        return artworkService.getById(id);
    }

    @PatchMapping("/{id}/")
    public void updateArtwork(@PathVariable("id") Long id, @Valid @RequestBody ArtworkUpdate partial){
        artworkService.updateArtworkTitle(id,partial);
    }

    @DeleteMapping("/{id}")
    public void deleteArtwork (@PathVariable("id") Long id){
        artworkService.deleteArtworkById(id);
    }

    /*
    @GetMapping("all")
    public List<ArtworkView> getAll(){
        return artworkService.getAllWork();
    }

     */
}
