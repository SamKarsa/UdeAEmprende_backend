package com.emprendimientos.udea_emprende.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.emprendimientos.udea_emprende.model.User;
import com.emprendimientos.udea_emprende.model.UserLogInSesion;
import com.emprendimientos.udea_emprende.repository.UserRepository;

@Service
public class UserLogInSesionService {
    private final UserRepository userRepository;

    public UserLogInSesionService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserLogInSesionByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    public UserLogInSesion verifyCredentials(String email, String password) {

        Optional<User> realUser = userRepository.findByEmail(email);
        UserLogInSesion userLogInSesion = new UserLogInSesion();

        if (realUser.isEmpty()) {
            userLogInSesion.setEmail("Email3Not@Found.");
            userLogInSesion.setUserStatus(false);
            return userLogInSesion;
        }
        if (!realUser.get().getPassword().equals(password)) {
            return null;
        }

        if (realUser.isEmpty() && !realUser.get().getPassword().equals(password)) {
            System.out.println(realUser.isEmpty());
            return null;
        } else {

            userLogInSesion.setEmail(realUser.get().getEmail());
            userLogInSesion.setPassword(realUser.get().getPassword());
            userLogInSesion.setUserStatus(realUser.get().getUserStatus());
            userLogInSesion.setUserId(realUser.get().getUserId());
        }

        return userLogInSesion;
    }

}
