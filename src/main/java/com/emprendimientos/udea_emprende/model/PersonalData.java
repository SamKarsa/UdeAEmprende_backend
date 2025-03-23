package com.emprendimientos.udea_emprende.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PERSONAL_DATA")
public class PersonalData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personalDataId;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastNames;

    @Column(nullable = false, length = 12)
    private String identificationNumber;

    @Column(nullable = false, length = 15)
    private String phoneNumber;

    // Conexion de la tabla PersonalData con la tabla User
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", nullable = false, unique = true)
    private User user;

    // Conexion de la tabla PersonalData con la tabla DocumentType
    @ManyToOne
    @JoinColumn(name = "documentTypeId", nullable = false)
    private DocumentType documentType;

    // Conexion de la tabla PersonalData con la tabla Ethnicity
    @ManyToOne
    @JoinColumn(name = "ethnicityId", nullable = false)
    private Ethnicity ethnicity;

    // Conexion de la tabla PersonalData con la tabla Occupation
    @ManyToOne
    @JoinColumn(name = "occupationId", nullable = false)
    private Occupation occupation;

    // Conexion de la tabla PersonalData con la tabla Vulnearbility
    @ManyToOne
    @JoinColumn(name = "vulnerabilityId", nullable = false)
    private Vulnerability vulnerability;
}
