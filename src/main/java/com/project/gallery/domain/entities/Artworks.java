package com.project.gallery.domain.entities;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany
    @JoinTable(name = "ARTWORKS_CATEGORIES", joinColumns = @JoinColumn(name="ARTWORK_ID"),
            inverseJoinColumns = @JoinColumn(name="CATEGORY_CODE"))
    private List<Categories> categoriesList;

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

    public List<Categories> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<Categories> categoriesList) {
        this.categoriesList = categoriesList;
    }


    @Override
    public String toString() {
        return "Artworks{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isPublic=" + isPublic +
                ", quantity=" + quantity +
                ", categoriesList=" + categoriesList +
                ", availabilities=" + availabilities +
                '}';
    }
}
