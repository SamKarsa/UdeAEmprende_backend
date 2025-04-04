package com.emprendimientos.udea_emprende.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ROLES")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rolesId;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "userTypeId", nullable = false)
    private UserType userType;

    // Métodos auxiliares para manejar solo los IDs en el JSON
    @Transient
    private Integer userId;

    @Transient
    private Integer userTypeId;

    @PostLoad
    private void fillTransient() {
        if (user != null) {
            this.userId = user.getUserId();
        }
        if (userType != null) {
            this.userTypeId = userType.getUserTypeId();
        }
    }

    @PrePersist
    @PreUpdate
    private void fillPersistent() {
        if (userId != null) {
            user = new User();
            user.setUserId(userId);
        }
        if (userTypeId != null) {
            userType = new UserType();
            userType.setUserTypeId(userTypeId);
        }
    }
}
