package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.dtos.ArtworkUpdate;
import com.project.gallery.domain.dtos.ArtworkView;

public interface ArtworksService {
    void create (ArtworkCreate artwork);

    ArtworkView getById (Long id);

    void updateArtwork(Long id, ArtworkUpdate partial);

    void deleteArtworkById(Long id);

}
