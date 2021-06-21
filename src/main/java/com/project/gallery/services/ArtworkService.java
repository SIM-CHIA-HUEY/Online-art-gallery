package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.dtos.ArtworkUpdate;
import com.project.gallery.domain.dtos.ArtworkView;

public interface ArtworkService {
    void create (ArtworkCreate artwork);

    ArtworkView getById (Long id);

    void updateArtworkTitle(Long id, ArtworkUpdate partial);

    void deleteArtworkById(Long id);

    //public List<ArtworkView> getAll();
}
