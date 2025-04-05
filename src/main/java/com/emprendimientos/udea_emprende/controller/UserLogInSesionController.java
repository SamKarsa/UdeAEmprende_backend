package com.emprendimientos.udea_emprende.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.UserLogInSesion;
import com.emprendimientos.udea_emprende.service.UserLogInSesionService;

import postMethodDTO.UserLogInSesionPostDTO;

@RestController
@RequestMapping("/api/userLogInSesion")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UserLogInSesionController {

    @Autowired
    private UserLogInSesionService userLogInSesionService;

    @PostMapping
    public UserLogInSesion getUserLogInSesionByEmail(@RequestBody UserLogInSesionPostDTO userLogInSesionPostDTO) {
        UserLogInSesion userLogInSesion = new UserLogInSesion();
        if (userLogInSesionService.verifyCredentials(userLogInSesionPostDTO.getEmail(),
                userLogInSesionPostDTO.getPassword()) != null) {
            userLogInSesion = userLogInSesionService.verifyCredentials(userLogInSesionPostDTO.getEmail(),
                    userLogInSesionPostDTO.getPassword());
        } else {
            System.out.println("User not found");
            userLogInSesion.setEmail("Email3Not@Found.");
            userLogInSesion.setPassword("Password3Not@Found.");
            userLogInSesion.setUserStatus(false);
            userLogInSesion.setUserId(0);
        }
        return userLogInSesion;
    }

}