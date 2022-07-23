package com.forFor.codathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forFor.codathon.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
