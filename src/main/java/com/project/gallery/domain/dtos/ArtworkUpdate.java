package com.project.gallery.domain.dtos;

import com.project.gallery.domain.entities.Availabilities;

public class ArtworkUpdate {
    // images and videos

    private String title ;
    private String description ;
    private int price ;
    private boolean isPublic ;
    private int quantity;
    private Availabilities availabilities ;


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

    public Availabilities getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(Availabilities availabilities) {
        this.availabilities = availabilities;
    }



    @Override
    public String toString() {
        return "ArtworkUpdate{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isPublic=" + isPublic +
                ", productionQuantity=" + quantity +
                ", availabilities=" + availabilities +
                '}';
    }

}
