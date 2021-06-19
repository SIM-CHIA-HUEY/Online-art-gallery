package com.project.gallery.domain.entities;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(mappedBy = "artwork")
    private Set<ArtworkCategory> artworkCategory;

    @ManyToOne
    @JoinColumn(name = "AVAILABILITIES")
    private Availabilities availabilitiesId;


    public Artwork(){
        //
    }

    /*
    public Long getArtworkId() {
        return artworkId;
    }
    public void setArtworkId(Long artworkId) {
        this.artworkId = artworkId;
    }

     */


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

    public Availabilities getAvailabilitiesId() {
        return availabilitiesId;
    }

    public void setAvailabilitiesId(Availabilities availabilitiesCode) {
        this.availabilitiesId = availabilitiesCode;
    }

    public Set<ArtworkCategory> getArtworkCategory() {
        return artworkCategory;
    }

    public void setArtworkCategory(Set<ArtworkCategory> artworkCategory) {
        this.artworkCategory = artworkCategory;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "artworkId=" + artworkId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isPublic=" + isPublic +
                ", productionQuantity=" + productionQuantity +
                ", artworkCategory=" + artworkCategory +
                ", availabilitiesId=" + availabilitiesId +
                '}';
    }
}
