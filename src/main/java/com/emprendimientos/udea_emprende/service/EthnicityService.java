package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emprendimientos.udea_emprende.model.Ethnicity;
import com.emprendimientos.udea_emprende.repository.EthnicityRepository;

@Service
public class EthnicityService {
    private final EthnicityRepository ethnicityRepository;

    public EthnicityService(EthnicityRepository ethnicityRepository) {
        this.ethnicityRepository = ethnicityRepository;
    }

    public List<Ethnicity> getEthnicities() {
        return ethnicityRepository.findAll();
    }

    public Ethnicity getEthnicityById(Integer ethnicityId) {
        return ethnicityRepository.findById(ethnicityId).orElse(null);
    }

    public Ethnicity saveEthnicity(Ethnicity ethnicity) {
        return ethnicityRepository.save(ethnicity);
    }

    public void deleteEthnicityById(Integer ethnicityId) {
        ethnicityRepository.deleteById(ethnicityId);
    }
}
