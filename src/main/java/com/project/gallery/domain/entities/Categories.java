package com.project.gallery.domain.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CATEGORIES")
public class Categories {

    @Id
    @Column(name="CATEGORY_CODE")
    private Long categoryCode ;

    @Column(name = "NAME")
    private String categoryName ;

    @ManyToMany(mappedBy="categoriesList")
    private List<Artworks> artworksList;

    public Categories(){
        //
    }

    public Long getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Long categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Artworks> getArtworksList() {
        return artworksList;
    }

    public void setArtworksList(List<Artworks> artworksList) {
        this.artworksList = artworksList;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", artworksList=" + artworksList +
                '}';
    }
}
