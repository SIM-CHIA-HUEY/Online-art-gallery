package com.project.gallery.domain.dtos;

import com.project.gallery.domain.entities.Availabilities;
import com.project.gallery.domain.entities.Categories;

import java.util.List;

public class ArtworkView {
    // + view images and videos !
    private String title ;
    private String description ;
    private int price ;
    private boolean isPublic ;
    private int productionQuantity ;
    private List<Categories> categoriesList;
    private Availabilities availabilities ;


    public ArtworkView() {
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isPublic() {
        return isPublic;
    }
    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public int getProductionQuantity() {
        return productionQuantity;
    }
    public void setProductionQuantity(int productionQuantity) {
        this.productionQuantity = productionQuantity;
    }


    public List<Categories> getCategoriesList() {
        return categoriesList;
    }
    public void setCategoriesList(List<Categories> categoriesList) {
        this.categoriesList = categoriesList;
    }



    public Availabilities getAvailabilities() {
        return availabilities;
    }
    public void setAvailabilities(Availabilities availabilities) {
        this.availabilities = availabilities;
    }

    @Override
    public String toString() {
        return "ArtworkView{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isPublic=" + isPublic +
                ", productionQuantity=" + productionQuantity +

                ", availabilities=" + availabilities +
                '}';
    }
}