package com.project.gallery.domain.dtos;

public class ArtworkView {
    private String title ;
    private String description ;
    private int price ;
    private boolean isPublic ;
    private int productionQuantity ;

    public ArtworkView(String title, String description, int price, boolean isPublic, int productionQuantity) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.isPublic = isPublic;
        this.productionQuantity = productionQuantity;
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
}