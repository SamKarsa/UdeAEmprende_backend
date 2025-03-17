package com.emprendimientos.udea_emprende.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "BUSINESS")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer businessId;

    @Column(nullable = false, length = 150)
    private String businessName;

    @Lob // Indica que es un campo grande de texto
    @Column(nullable = false, columnDefinition = "MEDIUMTEXT")
    private String businessDescription;

    @Column(nullable = false, length = 200)
    private String businessServiceHours;

    @Column(nullable = false)
    private boolean businessDelivery;

    @Column(nullable = false, length = 255)
    private String businessLocation;

    @Column(nullable = false, length = 15)
    private String businessPhoneNumber;

    @Column(nullable = false)
    private boolean businessStatus;

    // Relacion 1:N con BusinessCategory
    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BusinessCategory> businessCategories;

    // Relacion 1:N con Image
    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;

    // Relacion 1:N con Review
    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    // Relacion 1:N con User
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}
