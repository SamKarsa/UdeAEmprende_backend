package com.emprendimientos.udea_emprende.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(nullable = false, unique = true, length = 155)
    private String email;

    @Column(nullable = false, length = 155)
    private String password;

    @Column(nullable = false)
    private Boolean userStatus;

    // Relación 1:1 con PersonalData
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private PersonalData personalData;

    // Relacion de 1:N con Roles
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Roles> roles;
}
