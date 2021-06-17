package com.project.gallery.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ArtworkCreate {
    // + upload images and videos !
    @NotBlank private String title ;
    @NotBlank private String description ;
    //@NotBlank private Long categoryCodeOne ;
    //@NotBlank private Long categoryCodeTwo ;
    //@NotBlank private Long categoryCodeThree ;
    @NotNull private int price ;
    @NotNull private boolean isPublic ;
    @NotNull private int productionQuantity ;
    //@NotBlank private Long availabilitiesCode ;

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

    /*
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

     */

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
/*
    public Long getAvailabilitiesCode() {
        return availabilitiesCode;
    }
    public void setAvailabilitiesCode(Long availabilitiesCode) {
        this.availabilitiesCode = availabilitiesCode;
    }

 */

    @Override
    public String toString(){
        return "Artwork : [ Title : " + title + ", Description : " + description +
                ", Price : " + price + "Is it public ? " + isPublic + ", Quantity : " + productionQuantity;
    }
    /*
    ", Categories : " + categoryCodeOne +
                ", " + categoryCodeTwo + ", " + categoryCodeThree +

      + ", Availabilities : " + availabilitiesCode
     */
}
