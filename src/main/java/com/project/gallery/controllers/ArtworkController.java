package com.project.gallery.controllers;

import com.project.gallery.domain.dtos.ArtworkCreate;
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

    /*
    @GetMapping("all")
    public List<ArtworkView> getAll(){
        return artworkService.getAllWork();
    }

     */
}
