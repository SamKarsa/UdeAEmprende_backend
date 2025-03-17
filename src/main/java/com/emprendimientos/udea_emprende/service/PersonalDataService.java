package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emprendimientos.udea_emprende.repository.PersonalDataRepository;
import com.emprendimientos.udea_emprende.model.PersonalData;

@Service
public class PersonalDataService {
    private final PersonalDataRepository personalDataRepository;

    public PersonalDataService(PersonalDataRepository personalDataRepository) {
        this.personalDataRepository = personalDataRepository;
    }

    public List<PersonalData> getAllPersonalData() {
        return personalDataRepository.findAll();
    }

    public PersonalData getPersonalDataById(Integer personalDataId) {
        return personalDataRepository.findById(personalDataId).orElse(null);
    }

    public PersonalData savePersonalData(PersonalData personalData) {
        return personalDataRepository.save(personalData);
    }

    public void deletePersonalData(Integer personalDataId) {
        personalDataRepository.deleteById(personalDataId);
    }
}
