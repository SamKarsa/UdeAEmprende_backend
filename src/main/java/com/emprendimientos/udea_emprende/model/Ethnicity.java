package com.emprendimientos.udea_emprende.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
    @JsonIgnore // Evita recursión en JSON
    @ToString.Exclude // Evita recursión en toString()
    @EqualsAndHashCode.Exclude // Evita recursión en equals() y hashCode()
    private List<PersonalData> personalDataList;
}
