package com.forFor.codathon.service;

import java.util.List;

import com.forFor.codathon.model.Theatre;

public interface TheatreService {
    List<Theatre> getAllTheatres();

    Theatre getTheatreById(Long theatre_id);

    Theatre pushTheatre(Theatre newTheatre);

    Theatre updateTheatre(Theatre updatedTheatre, Long theatre_id);

    void deleteTheatreById(Long theatre_id);
}
