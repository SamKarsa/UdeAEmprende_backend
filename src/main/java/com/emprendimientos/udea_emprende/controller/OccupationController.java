package com.emprendimientos.udea_emprende.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.Occupation;
import com.emprendimientos.udea_emprende.service.OccupationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/occupations")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class OccupationController {

    @Autowired
    private OccupationService occupationService;

    @GetMapping
    public List<Occupation> getAllOccupations() {
        return occupationService.getAllOccupations();
    }

    @PostMapping
    public Occupation createNewOccupation(@RequestBody Occupation newOccupation) {
        occupationService.saveOccupation(newOccupation);
        return newOccupation;
    }

    @GetMapping("/{id}")
    public Occupation getOccupationById(@PathVariable Integer id) {
        return occupationService.getOccupationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOccupationById(@PathVariable Integer id) {
        occupationService.deleteOccupationById(id);
    }

}
