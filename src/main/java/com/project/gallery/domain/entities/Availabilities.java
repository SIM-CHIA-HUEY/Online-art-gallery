package com.project.gallery.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AVAILABILITIES")
public class Availabilities {

    @Id
    @Column(name = "AVAILABILITIES_CODE", nullable = false)
    private String availabilitiesCode ;

    @Column(name = "AVAILABILITIES_NAME", nullable = false)
    private String availabilitiesName ;

    public Availabilities(){
        //
    }

    public String getAvailabilitiesCode() {
        return availabilitiesCode;
    }

    public void setAvailabilitiesCode(String availabilitiesCode) {
        this.availabilitiesCode = availabilitiesCode;
    }

    public String getAvailabilitiesName() {
        return availabilitiesName;
    }

    public void setAvailabilitiesName(String availabilitiesName) {
        this.availabilitiesName = availabilitiesName;
    }
}
