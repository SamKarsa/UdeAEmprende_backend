package com.emprendimientos.udea_emprende.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "IMAGE")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer imageId;

    @Column(nullable = false, length = 50)
    private String imageURL;

    // Relacion N:1 con Business
    @ManyToOne
    @JoinColumn(name = "businessId", nullable = false)
    private Business business;
}
