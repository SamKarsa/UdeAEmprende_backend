package com.emprendimientos.udea_emprende.model;

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
}
