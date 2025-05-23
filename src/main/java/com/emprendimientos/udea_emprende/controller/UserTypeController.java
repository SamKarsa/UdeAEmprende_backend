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
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.UserType;
import com.emprendimientos.udea_emprende.service.UserTypeService;

@RestController
@RequestMapping("/api/userType")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;

    @GetMapping
    public List<UserType> getAllUserTypes() {
        return userTypeService.getAllUserType();
    }

    @PostMapping
    public UserType createNewUserType(@RequestBody UserType newUserType) {
        userTypeService.saveUserType(newUserType);
        return newUserType;
    }

    @GetMapping("/{id}")
    public UserType getUserTypeById(@PathVariable Integer id) {
        return userTypeService.getUserTypeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUserTypeById(@PathVariable Integer id) {
        userTypeService.deleteUserTypeById(id);
    }
}
