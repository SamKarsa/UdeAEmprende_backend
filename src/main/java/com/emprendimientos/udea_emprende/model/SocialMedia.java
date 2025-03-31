package com.emprendimientos.udea_emprende.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
    @JsonIgnore // Evita recursión en JSON
    @ToString.Exclude // Evita recursión en toString()
    @EqualsAndHashCode.Exclude // Evita recursión en equals() y hashCode()
    private Business business;
}
