package com.project.gallery.repositories;

import com.project.gallery.domain.entities.Artwork;
import com.project.gallery.domain.entities.Availabilities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AvailabilitiesRepository extends JpaRepository<Availabilities, Long> {
    Optional<Availabilities> findByName(String name);
}
