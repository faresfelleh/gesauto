package com.pfe.gesauto.repository;

import com.pfe.gesauto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
