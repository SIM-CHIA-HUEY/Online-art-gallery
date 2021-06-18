package com.project.gallery.repositories;

import com.project.gallery.domain.entities.Artwork;
import com.project.gallery.domain.entities.Availabilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailabilitiesRepository extends JpaRepository<Availabilities, Long> {

}
