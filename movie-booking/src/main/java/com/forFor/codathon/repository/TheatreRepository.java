package com.forFor.codathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forFor.codathon.model.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
