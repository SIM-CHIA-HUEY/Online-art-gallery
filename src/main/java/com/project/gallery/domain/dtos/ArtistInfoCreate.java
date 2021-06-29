package com.project.gallery.domain.dtos;

import com.project.gallery.domain.entities.UserAccount;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ArtistInfoCreate {
    @NotNull
    private Long atelierIdentificationNo;

    @NotBlank @Size(min = 1, max = 50)
    private String pseudonym ;

    @NotBlank @Size(min = 1, max = 50)
    private String firstname ;

    @NotBlank @Size(min = 1, max = 50)
    private String lastname ;

    @NotBlank @Size(min = 1, max = 1500)
    private String description ;

    @NotBlank @Size(min = 1, max = 255)
    private String atelierAddress ;

    @NotBlank @Size(min = 1, max = 10)
    private String atelierTelephone ;

    @NotNull
    private Long userId ;

    public ArtistInfoCreate(){
        //
    }

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ArtistInfoCreate{" +
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
