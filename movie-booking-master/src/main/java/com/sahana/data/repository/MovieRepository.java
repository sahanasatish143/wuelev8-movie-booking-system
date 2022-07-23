package com.sahana.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sahana.data.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
    Movie findByMovieName(String movieName);
    Movie findByMovieId(long movieId);
}
