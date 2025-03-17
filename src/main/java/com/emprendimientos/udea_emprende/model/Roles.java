package com.emprendimientos.udea_emprende.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ROLES")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rolesId;

    @Column(nullable = false, updatable = false)
    private LocalDateTime create;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime modified;

    // Relación N:1 con User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    // Relación N:1 con UserType
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userTypeId", nullable = false)
    private UserType userType;

}
