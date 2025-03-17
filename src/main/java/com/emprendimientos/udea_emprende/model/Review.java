package com.emprendimientos.udea_emprende.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "REVIEW")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;

    @Lob // Indica que es un campo grande de texto
    @Column(nullable = false, columnDefinition = "MEDIUMTEXT")
    private String reviewDesciption;

    @Column(nullable = false)
    private Integer rating;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

}
