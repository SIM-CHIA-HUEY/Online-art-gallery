package com.project.gallery.repositories;

import com.project.gallery.domain.entities.ArtistInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistInfoRepository extends JpaRepository<ArtistInfo, Long> {
}
