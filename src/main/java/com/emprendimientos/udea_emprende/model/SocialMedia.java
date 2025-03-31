package com.emprendimientos.udea_emprende.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SOCIAL_MEDIA")
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer socialMediaId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private SocialMediaPlatform platform; // Enum con valores como FACEBOOK, INSTAGRAM, etc.

    @Column(nullable = false, length = 255)
    private String url;

    // Relacion N:1 con Business
    @ManyToOne
    @JoinColumn(name = "businessId", nullable = false)
    private Business business;
}
