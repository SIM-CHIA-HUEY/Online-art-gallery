package com.project.gallery.domain.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class ArtworksCategories {

    @Id
    private Long artworkCategoryId ;

    @ManyToMany
    @JoinColumn(name = "ARTWORK_ID")
    private Artwork artworkId;

    @ManyToMany
    @JoinColumn(name = "CATEGORY_CODE")
    private Categories categoryCode ;

    public ArtworksCategories(){
        //
    }


}
