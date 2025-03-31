package com.emprendimientos.udea_emprende.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name = "REVIEW")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;

    @Lob // Indica que es un campo grande de texto
    @Column(nullable = false, columnDefinition = "MEDIUMTEXT")
    private String reviewDescription;

    @Column(nullable = false)
    private Integer rating;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // Relacion N:1 con Business
    @ManyToOne
    @JoinColumn(name = "businessId", nullable = false)
    @JsonIgnore // Evita recursión en JSON
    @ToString.Exclude // Evita recursión en toString()
    @EqualsAndHashCode.Exclude // Evita recursión en equals() y hashCode()
    private Business business;

    // Relacion N:1 con User
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}
