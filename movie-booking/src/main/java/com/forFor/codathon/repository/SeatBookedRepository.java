package com.forFor.codathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forFor.codathon.model.SeatBooked;

public interface SeatBookedRepository extends JpaRepository<SeatBooked, Long> {
}
