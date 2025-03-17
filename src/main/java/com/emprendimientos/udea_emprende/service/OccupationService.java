package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emprendimientos.udea_emprende.repository.OccupationRepository;
import com.emprendimientos.udea_emprende.model.Occupation;

@Service
public class OccupationService {
    private final OccupationRepository occupationRepository;

    public OccupationService(OccupationRepository occupationRepository) {
        this.occupationRepository = occupationRepository;
    }

    public List<Occupation> geOccupations() {
        return occupationRepository.findAll();
    }

    public Occupation getOccupationById(Integer occupationId) {
        return occupationRepository.findById(occupationId).orElse(null);
    }

    public Occupation saveOccupation(Occupation occupation) {
        return occupationRepository.save(occupation);
    }

    public void deleteOccupationById(Integer occupationId) {
        occupationRepository.deleteById(occupationId);
    }
}
