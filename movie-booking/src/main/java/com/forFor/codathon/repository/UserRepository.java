package com.forFor.codathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forFor.codathon.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
