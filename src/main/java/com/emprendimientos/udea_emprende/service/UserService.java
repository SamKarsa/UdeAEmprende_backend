package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emprendimientos.udea_emprende.repository.UserRepository;
import com.emprendimientos.udea_emprende.model.User;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
