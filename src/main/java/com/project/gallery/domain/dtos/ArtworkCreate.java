package com.project.gallery.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ArtworkCreate {
    // + upload images and videos !
    @NotBlank @Size(min = 1, max = 50) private String title ;
    @NotBlank @Size(min = 1, max = 255) private String description ;
    private Long categoryCodeOne ;
    private Long categoryCodeTwo ;
    private Long categoryCodeThree ;
    @NotNull private int price ;
    @NotNull private boolean isPublic ;
    @NotNull private int productionQuantity ;
    @NotNull private Long availabilitiesId;

    public ArtworkCreate(){
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

    public Long getCategoryCodeOne() {
        return categoryCodeOne;
    }
    public void setCategoryCodeOne(Long categoryCodeOne) {
        this.categoryCodeOne = categoryCodeOne;
    }

    public Long getCategoryCodeTwo() {
        return categoryCodeTwo;
    }
    public void setCategoryCodeTwo(Long categoryCodeTwo) {
        this.categoryCodeTwo = categoryCodeTwo;
    }

    public Long getCategoryCodeThree() {
        return categoryCodeThree;
    }
    public void setCategoryCodeThree(Long categoryCodeThree) {
        this.categoryCodeThree = categoryCodeThree;
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

    public Long getAvailabilitiesId() {
        return availabilitiesId;
    }
    public void setAvailabilitiesId(Long availabilitiesId) {
        this.availabilitiesId = availabilitiesId;
    }

    @Override
    public String toString(){
        return "Artwork : [ Title : " + title + ", Description : " + description +
                ", Price : " + price + "Is it public ? " + isPublic + ", Quantity : " + productionQuantity +
                ", Categories : " + categoryCodeOne +
                ", " + categoryCodeTwo + ", " + categoryCodeThree +
                ", Availabilities : " + availabilitiesId;
    }



}
