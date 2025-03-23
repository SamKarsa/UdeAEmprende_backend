package com.emprendimientos.udea_emprende.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.PersonalData;
import com.emprendimientos.udea_emprende.service.PersonalDataService;

@RestController
@RequestMapping("/api/personal-data")
public class PersonalDataController {
    @Autowired
    private PersonalDataService personalDataService;

    @GetMapping
    public List<PersonalData> getAllPersonalData() {
        return personalDataService.getAllPersonalData();
    }

    @PostMapping
    public PersonalData createNewPersonalData(@RequestBody PersonalData newPersonalData) {
        personalDataService.savePersonalData(newPersonalData);
        return newPersonalData;
    }

    @GetMapping("/{id}")
    public PersonalData getPersonalDataById(@PathVariable Integer id) {
        return personalDataService.getPersonalDataById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePersonalDataById(@PathVariable Integer id) {
        personalDataService.deletePersonalDataById(id);
    }
}
