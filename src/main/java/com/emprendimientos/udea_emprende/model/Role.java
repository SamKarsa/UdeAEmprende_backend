package com.emprendimientos.udea_emprende.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ROLES")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rolesId;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Relación N:1 con User
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    // Relación N:1 con UserType
    @ManyToOne
    @JoinColumn(name = "userTypeId", nullable = false)
    private UserType userType;

}
