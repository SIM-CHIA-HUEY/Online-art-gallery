package com.project.gallery.mapper;

import com.project.gallery.domain.dtos.ArtworkUpdate;
import com.project.gallery.domain.entities.Artworks;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel="spring")
public interface ArtworkMapper {
    void updateArtworkFromArtworkUpdate (ArtworkUpdate artwokDto, @MappingTarget Artworks entity);
}
