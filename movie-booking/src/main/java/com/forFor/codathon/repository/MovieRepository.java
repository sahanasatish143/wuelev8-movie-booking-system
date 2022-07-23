package com.forFor.codathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forFor.codathon.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
