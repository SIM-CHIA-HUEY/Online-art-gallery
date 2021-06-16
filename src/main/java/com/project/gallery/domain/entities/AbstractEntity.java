package com.project.gallery.domain.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract class AbstractEntity {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    AbstractEntity() {
        //
    }

    public Long getArtworkId() {
        return Id;
    }

     */
}
