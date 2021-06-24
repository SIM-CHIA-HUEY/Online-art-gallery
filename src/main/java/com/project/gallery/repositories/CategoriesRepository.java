package com.project.gallery.repositories;

import com.project.gallery.domain.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
    @Override
    Optional<Categories> findById(Long categoryCode);
}
