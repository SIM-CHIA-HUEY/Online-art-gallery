package com.project.gallery.repositories;

import com.project.gallery.domain.entities.Artworks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArtworksRepository extends JpaRepository <Artworks, Long> {

    @Override
    Optional<Artworks> findById(Long id);


}
