package com.emprendimientos.udea_emprende.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ETHNICITY")
public class Ethnicity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ethnicityId;

    @Column(nullable = false, length = 100)
    private String ethnicityName;
}
