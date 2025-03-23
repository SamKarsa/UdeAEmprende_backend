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

import com.emprendimientos.udea_emprende.model.BusinessCategory;
import com.emprendimientos.udea_emprende.service.BusinessCategoryService;

@RestController
@RequestMapping("/api/business-categories")
public class BusinessCategoryController {

    @Autowired
    private BusinessCategoryService businessCategoryService;

    @GetMapping
    public List<BusinessCategory> getAllBusinessCategories() {
        return businessCategoryService.getAllBusinessCategories();
    }

    @PostMapping
    public BusinessCategory createNewCategoryBusiness(@RequestBody BusinessCategory newBusiness) {
        businessCategoryService.saveBusinessCategory(newBusiness);
        return newBusiness;
    }

    @GetMapping("/{id}")
    public BusinessCategory getBusinessCategory(@PathVariable Integer id) {
        return businessCategoryService.getBusinessCategoryById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBusinessCategoryById(@PathVariable Integer id) {
        businessCategoryService.deleteBusinessCategoryById(id);
    }

}
