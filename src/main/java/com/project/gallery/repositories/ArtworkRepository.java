package com.project.gallery.repositories;

import com.project.gallery.domain.entities.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArtworkRepository extends JpaRepository <Artwork, Long> {

    @Override
    Optional<Artwork> findById(Long id);
}
