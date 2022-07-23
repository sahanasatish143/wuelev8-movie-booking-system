package com.forFor.codathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forFor.codathon.model.Auditorium;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {
}
