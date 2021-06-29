package com.project.gallery.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "ARTIST_INFO")
public class ArtistInfo {

    @Id
    @Column(name="atelier_identification_no")
    private Long atelierIdentificationNo;

    @Column(name = "pseudonym", nullable = false)
    private String pseudonym ;

    @Column(name = "firstname", nullable = false)
    private String firstname ;

    @Column(name = "lastname", nullable = false)
    private String lastname ;

    @Column(name = "description", nullable = false)
    private String description ;

    @Column(name = "atelier_address", nullable = false)
    private String atelierAddress ;

    @Column(name = "atelier_telephone", nullable = false)
    private String atelierTelephone ;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserAccount userId ;


    public Long getAtelierIdentificationNo() {
        return atelierIdentificationNo;
    }

    public void setAtelierIdentificationNo(Long atelierIdentificationNo) {
        this.atelierIdentificationNo = atelierIdentificationNo;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAtelierAddress() {
        return atelierAddress;
    }

    public void setAtelierAddress(String atelierAddress) {
        this.atelierAddress = atelierAddress;
    }

    public String getAtelierTelephone() {
        return atelierTelephone;
    }

    public void setAtelierTelephone(String atelierTelephone) {
        this.atelierTelephone = atelierTelephone;
    }

    public UserAccount getUserId() {
        return userId;
    }

    public void setUserId(UserAccount userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ArtistInfo{" +
                "atelierIdentificationNo=" + atelierIdentificationNo +
                ", pseudonym='" + pseudonym + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", description='" + description + '\'' +
                ", atelierAddress='" + atelierAddress + '\'' +
                ", atelierTelephone='" + atelierTelephone + '\'' +
                ", userId=" + userId +
                '}';
    }
}
