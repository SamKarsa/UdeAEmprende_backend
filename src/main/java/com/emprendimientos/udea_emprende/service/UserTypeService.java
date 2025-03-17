package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.emprendimientos.udea_emprende.model.UserType;
import com.emprendimientos.udea_emprende.repository.UserTypeRepository;

@Service
public class UserTypeService {
    private final UserTypeRepository userTypeRepository;

    public UserTypeService(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    public List<UserType> getAllUserType() {
        return userTypeRepository.findAll();
    }

    public UserType getUserTypeById(Integer id) {
        return userTypeRepository.findById(id).orElse(null);
    }

    public UserType saveUserType(UserType userType) {
        return userTypeRepository.save(userType);
    }

    public void deleteUserTypeById(Integer id) {
        userTypeRepository.deleteById(id);
    }
}
