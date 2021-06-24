package com.project.gallery.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class ArtworkCreate {
    // + upload images and videos !
    @NotBlank @Size(min = 1, max = 255) private String title ;
    @NotBlank @Size(min = 1, max = 1500) private String description ;
    private List<Long> categoriesList;
    @NotNull private int price ;
    @NotNull private boolean isPublic ;
    @NotNull private int quantity;
    @NotNull private Long availabilities;

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
        return "ArtworkCreate{" +
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
