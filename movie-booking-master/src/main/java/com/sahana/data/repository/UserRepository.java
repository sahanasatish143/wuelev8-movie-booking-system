package com.sahana.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahana.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);
}
