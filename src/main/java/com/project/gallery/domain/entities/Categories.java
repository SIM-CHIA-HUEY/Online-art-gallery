package com.project.gallery.domain.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CATEGORIES")
public class Categories {

    @Id
    private Long categoryId ;

    @Column(name = "NAME")
    private String categoryName ;

    @OneToMany(mappedBy = "category")
    private Set<ArtworkCategory> artworkCategory;

    public Categories(){
        //
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<ArtworkCategory> getArtworkCategory() {
        return artworkCategory;
    }

    public void setArtworkCategory(Set<ArtworkCategory> artworkCategory) {
        this.artworkCategory = artworkCategory;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", artworkCategory=" + artworkCategory +
                '}';
    }
}
