package com.project.gallery.services;

import com.project.gallery.domain.dtos.ArtworkCreate;

public interface ArtworkService {
    void create (ArtworkCreate artwork);

    //public List<ArtworkView> getAll();
}
