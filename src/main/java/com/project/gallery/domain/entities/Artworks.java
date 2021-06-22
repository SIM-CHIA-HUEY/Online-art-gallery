package com.project.gallery.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "ARTWORKS")
public class Artworks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ARTWORK_ID")
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title ;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description ;

    @Column(name = "PRICE", nullable = false)
    private int price ;

    @Column(name = "IS_PUBLIC", nullable = false)
    private boolean isPublic ;

    @Column(name = "QUANTITY", nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ONE")
    private Categories categoryOne;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_TWO")
    private Categories categoryTwo;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_THREE")
    private Categories categoryThree;

    @ManyToOne
    @JoinColumn(name = "AVAILABILITIES")
    private Availabilities availabilities;


    public Artworks(){
        //
    }


    public Long getId() {
        return id;
    }

    public void setId(Long artworkId) {
        this.id = artworkId;
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

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int productionQuantity) {
        this.quantity = productionQuantity;
    }

    public Availabilities getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(Availabilities availabilitiesCode) {
        this.availabilities = availabilitiesCode;
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

    public void setCategoryTwo(Categories categoryCodeTwo) {
        this.categoryTwo = categoryCodeTwo;
    }

    public Categories getCategoryThree() {
        return categoryThree;
    }

    public void setCategoryThree(Categories categoryCodeThree) {
        this.categoryThree = categoryCodeThree;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "artworkId=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isPublic=" + isPublic +
                ", productionQuantity=" + quantity +
                ", categoryCodeOne=" + categoryOne +
                ", categoryCodeTwo=" + categoryTwo +
                ", categoryCodeThree=" + categoryThree +
                ", availabilitiesId=" + availabilities +
                '}';
    }
}
