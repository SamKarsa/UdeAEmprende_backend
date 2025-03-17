package com.emprendimientos.udea_emprende.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "BUSINESS_CATEGORY")
public class BusinessCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer businessCategoryId;

    // Relacion N:1 con Category
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    // Relacion N:1 con Business
    @ManyToOne
    @JoinColumn(name = "businessId", nullable = false)
    private Business business;
}
