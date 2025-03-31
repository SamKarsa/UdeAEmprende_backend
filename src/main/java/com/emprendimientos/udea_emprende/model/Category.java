package com.emprendimientos.udea_emprende.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    @Column(nullable = false, length = 100)
    private String categoryName;

    @Column(nullable = false)
    private boolean categoryStatus;

    // Relacion 1:N con BusinessCategory
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore // Evita recursión en JSON
    @ToString.Exclude // Evita recursión en toString()
    @EqualsAndHashCode.Exclude // Evita recursión en equals() y hashCode()
    private List<BusinessCategory> businessCategories;
}
