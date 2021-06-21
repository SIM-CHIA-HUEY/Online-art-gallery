package com.project.gallery.domain.dtos;


import com.project.gallery.domain.entities.Availabilities;
import com.project.gallery.domain.entities.Categories;

public class ArtworkUpdate {
    // images and videos

    private String title ;
    private String description ;
    private int price ;
    private boolean isPublic ;
    private int productionQuantity ;
    private Categories categoryOne ;
    private Categories categoryTwo ;
    private Categories categoryThree ;
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

    public int getProductionQuantity() {
        return productionQuantity;
    }

    public void setProductionQuantity(int productionQuantity) {
        this.productionQuantity = productionQuantity;
    }

    public Categories getCategoryOne() {
        return categoryOne;
    }

    public void setCategoryOne(Categories categoryOne) {
        this.categoryOne = categoryOne;
    }

    public Categories getCategoryTwo() {
        return categoryTwo;
    }

    public void setCategoryTwo(Categories categoryTwo) {
        this.categoryTwo = categoryTwo;
    }

    public Categories getCategoryThree() {
        return categoryThree;
    }

    public void setCategoryThree(Categories categoryThree) {
        this.categoryThree = categoryThree;
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
                ", productionQuantity=" + productionQuantity +
                ", categoryOne=" + categoryOne +
                ", categoryTwo=" + categoryTwo +
                ", categoryThree=" + categoryThree +
                ", availabilities=" + availabilities +
                '}';
    }

}
