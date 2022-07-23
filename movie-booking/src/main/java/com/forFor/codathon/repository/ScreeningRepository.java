package com.forFor.codathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forFor.codathon.model.Screening;

import java.util.List;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {}
