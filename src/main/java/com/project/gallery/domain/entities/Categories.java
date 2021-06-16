package com.project.gallery.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIES")
public class Categories {

    @Id
    @Column(name = "CATEGORY_CODE", nullable = false)
    private String categoryCode;

    @Column(name = "CATEGORY_NAME", nullable = false)
    private String categoryName ;

    public Categories(){
        //
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
