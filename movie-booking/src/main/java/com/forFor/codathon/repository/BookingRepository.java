package com.forFor.codathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forFor.codathon.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
