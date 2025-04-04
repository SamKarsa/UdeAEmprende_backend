package com.emprendimientos.udea_emprende.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.Business;
import com.emprendimientos.udea_emprende.service.BusinessService;

@RestController
@RequestMapping("/api/business")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @GetMapping
    public List<Business> getAllBusinesses() {
        return businessService.getAllBusinesses();
    }

    @PostMapping
    public Business createNewBusiness(@RequestBody Business newBusiness) {
        businessService.saveBusiness(newBusiness);
        return newBusiness;
    }

    @GetMapping("/{id}")
    public Business getBusinessById(@PathVariable Integer id) {
        return businessService.getBusinessById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBusinessById(@PathVariable Integer id) {
        businessService.deleteBusinessById(id);
    }

    @GetMapping("/by-category/{categoryId}")
    public List<Business> getBusinessesByCategory(@PathVariable Integer categoryId) {
        return businessService.getBusinessesByCategoryId(categoryId);
    }

    @GetMapping("/search")
    public List<Business> searchBusinesses(@RequestParam String q) {
        return businessService.searchBusinesses(q);
    }

}
