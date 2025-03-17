package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.emprendimientos.udea_emprende.repository.BusinessCategoryRepository;
import com.emprendimientos.udea_emprende.model.BusinessCategory;

@Service
public class BusinessCategoryService {
    private final BusinessCategoryRepository businessCategoryRepository;

    public BusinessCategoryService(BusinessCategoryRepository businessCategoryRepository) {
        this.businessCategoryRepository = businessCategoryRepository;
    }

    public List<BusinessCategory> getAllBusinessCategories() {
        return businessCategoryRepository.findAll();
    }

    public BusinessCategory getBusinessCategoryById(Integer id) {
        return businessCategoryRepository.findById(id).orElse(null);
    }

    public BusinessCategory saveBusinessCategory(BusinessCategory businessCategory) {
        return businessCategoryRepository.save(businessCategory);
    }

    public void deleteBusinessCategoryById(Integer id) {
        businessCategoryRepository.deleteById(id);
    }
}
