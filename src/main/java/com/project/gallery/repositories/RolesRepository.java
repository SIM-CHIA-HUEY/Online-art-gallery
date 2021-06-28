package com.project.gallery.repositories;

import com.project.gallery.domain.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<UserRole, Long> {
}
