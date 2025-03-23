package com.emprendimientos.udea_emprende.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.Ethnicity;
import com.emprendimientos.udea_emprende.service.EthnicityService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/ethnicity")
public class EthnicityController {

    @Autowired
    private EthnicityService ethnicityService;

    @GetMapping("/lisEthnicities")
    public List<Ethnicity> getAllEthnicities() {
        return ethnicityService.getAllEthnicities();
    }

    @PostMapping
    public Ethnicity createNewEthnicity(Ethnicity newEthnicity) {
        return ethnicityService.saveEthnicity(newEthnicity);
    }

    @GetMapping("/{id}")
    public Ethnicity getEthnicityById(@PathVariable Integer id) {
        return ethnicityService.getEthnicityById(id);
    }

    @DeleteMapping("/{id}")
    public void deletetEthnicityById(@PathVariable Integer id) {
        ethnicityService.deleteEthnicityById(id);
    }

}
