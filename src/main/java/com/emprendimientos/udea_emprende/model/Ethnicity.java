package com.emprendimientos.udea_emprende.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ETHNICITY")
public class Ethnicity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ethnicityId;

    @Column(nullable = false, length = 50)
    private String ethnicityName;

    // Conexion de la tabla Ethnicity con la tabla PersonalData
    @OneToMany(mappedBy = "ethnicity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PersonalData> personalDataList;
}
