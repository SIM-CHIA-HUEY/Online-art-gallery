package com.project.gallery.domain.dtos;

import com.project.gallery.domain.entities.Availabilities;

import java.util.List;

public class ArtworkUpdate {
    // images and videos

    private String title ;
    private String description ;
    private List<Long> categoriesList;
    private int price ;
    private boolean isPublic ;
    private int quantity;
    private Long availabilities ;


    public ArtworkUpdate(){
        //
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

    public List<Long> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<Long> categoriesList) {
        this.categoriesList = categoriesList;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(Long availabilities) {
        this.availabilities = availabilities;
    }

    @Override
    public String toString() {
        return "ArtworkUpdate{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", categoriesList=" + categoriesList +
                ", price=" + price +
                ", isPublic=" + isPublic +
                ", quantity=" + quantity +
                ", availabilities=" + availabilities +
                '}';
    }
}
