package com.project.gallery.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIES")
public class Categories {

    @Id
    private Long categoryCode ;

    @Column(name = "NAME")
    private String categoryName ;

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


    @Override
    public String toString() {
        return "Categories{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
