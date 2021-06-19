package com.project.gallery.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "ARTWORK_CATEGORY")
public class ArtworkCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artworkCategoryId;

    @ManyToOne
    @JoinColumn(name = "ARTWORK_ID", nullable = false)
    Artwork artwork;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", nullable = false)
    Categories category;

    public ArtworkCategory(){
        //
    }

    public Long getArtworkCategoryId() {
        return artworkCategoryId;
    }

    public void setArtworkCategoryId(Long artworkCategoryId) {
        this.artworkCategoryId = artworkCategoryId;
    }

    public Artwork getArtwork() {
        return artwork;
    }

    public void setArtwork(Artwork artwork) {
        this.artwork = artwork;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ArtworkCategory{" +
                "artworkCategoryId=" + artworkCategoryId +
                ", artwork=" + artwork +
                ", category=" + category +
                '}';
    }
}
