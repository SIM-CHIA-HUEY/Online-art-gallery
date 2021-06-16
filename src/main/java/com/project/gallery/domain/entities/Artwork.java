package com.project.gallery.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "ARTWORKS")
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artworkId;

    @Column(name = "TITLE", nullable = false)
    private String title ;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description ;

    @Column(name = "PRICE", nullable = false)
    private int price ;

    @Column(name = "IS_PUBLIC", nullable = false)
    private boolean isPublic ;

    @Column(name = "QUANTITY", nullable = false)
    private int productionQuantity ;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ONE")
    private Categories categoryOne;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_TWO", nullable = false)
    private Categories categoryTwo ;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_THREE", nullable = false)
    private Categories categoryThree ;

    @ManyToOne
    @JoinColumn(name = "AVAILABILITIES")
    private Availabilities availabilities ;

    public Artwork(){
        //
    }

    public Long getArtworkId() {
        return artworkId;
    }
    public void setArtworkId(Long artworkId) {
        this.artworkId = artworkId;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {return description; }
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
    public void setCategoryOne(Categories categoryCodeOne) {
        this.categoryOne = categoryCodeOne;
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
}
