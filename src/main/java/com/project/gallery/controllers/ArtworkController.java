package com.project.gallery.controllers;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.dtos.ArtworkUpdate;
import com.project.gallery.domain.dtos.ArtworkView;
import com.project.gallery.services.ArtworksService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/artworks")
public class ArtworkController {

    private final ArtworksService artworksService;

    public ArtworkController (ArtworksService artworksService){
        this.artworksService = artworksService;
    }

    @PostMapping
    public void createArtwork (@Valid @RequestBody ArtworkCreate newArtwork){
        artworksService.create(newArtwork);
    }

    @GetMapping("/{id}")
    public ArtworkView getById(@PathVariable("id") Long id){
        return artworksService.getById(id);
    }

    @PutMapping("/{id}")
    public void updateArtwork(@PathVariable("id") Long id, @Valid @RequestBody ArtworkUpdate partial){
        artworksService.updateArtwork(id,partial);
    }

    @DeleteMapping("/{id}")
    public void deleteArtwork (@PathVariable("id") Long id){
        artworksService.deleteArtworkById(id);
    }

}
