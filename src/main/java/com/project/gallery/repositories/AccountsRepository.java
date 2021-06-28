package com.project.gallery.repositories;

import com.project.gallery.domain.entities.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<UserAccount, Long> {


}
