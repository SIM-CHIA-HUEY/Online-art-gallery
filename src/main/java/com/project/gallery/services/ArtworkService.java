package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;
import com.project.gallery.domain.dtos.ArtworkView;

public interface ArtworkService {
    void create (ArtworkCreate artwork);

    ArtworkView getById (Long id);

    //public List<ArtworkView> getAll();
}
