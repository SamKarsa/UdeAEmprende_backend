package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.emprendimientos.udea_emprende.repository.BusinessRepository;
import com.emprendimientos.udea_emprende.model.Business;

@Service
public class BusinessService {
    private final BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }

    public Business getBusinessById(Integer id) {
        return businessRepository.findById(id).orElse(null);
    }

    public Business saveBusiness(Business business) {
        return businessRepository.save(business);
    }

    public void deleteBusinessById(Integer id) {
        businessRepository.deleteById(id);
    }

    public List<Business> getBusinessesByCategoryId(Integer categoryId) {
        return businessRepository.findBusinessesByCategoryId(categoryId);
    }

    public List<Business> searchBusinesses(String query) {
        return businessRepository.searchBusinesses(query);
    }
}
