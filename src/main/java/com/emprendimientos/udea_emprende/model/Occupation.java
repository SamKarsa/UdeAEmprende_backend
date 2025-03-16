package com.emprendimientos.udea_emprende.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "OCCUPATION")
public class Occupation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer occupationOccupationId;

    @Column(nullable = false, length = 100)
    private String occupationName;
}
