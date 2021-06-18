package com.project.gallery.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AVAILABILITIES")
public class Availabilities {

    @Id
    private Long availabilitiesCode ;

    @Column
    private String availabilitiesName ;

    public Availabilities() {
        //
    }

    public Long getAvailabilitiesCode() {
        return availabilitiesCode;
    }

    public void setAvailabilitiesCode(Long availabilitiesCode) {
        this.availabilitiesCode = availabilitiesCode;
    }

    public String getAvailabilitiesName() {
        return availabilitiesName;
    }

    public void setAvailabilitiesName(String availabilitiesName) {
        this.availabilitiesName = availabilitiesName;
    }
}
