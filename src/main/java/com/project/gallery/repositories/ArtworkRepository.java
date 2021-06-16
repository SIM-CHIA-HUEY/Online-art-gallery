package com.project.gallery.repositories;

import com.project.gallery.domain.entities.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtworkRepository extends JpaRepository <Artwork, Long> {

}
