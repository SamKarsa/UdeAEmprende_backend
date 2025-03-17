package com.emprendimientos.udea_emprende.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "OCCUPATION")
public class Occupation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer occupationId;

    @Column(nullable = false, length = 100)
    private String occupationName;

    // Conexion de la tabla Occupation con la tabla PersonalData
    @OneToMany(mappedBy = "occupation", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<PersonalData> personalDataList;
}
