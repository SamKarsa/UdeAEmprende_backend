package com.emprendimientos.udea_emprende.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DOCUMENT_TYPE")
public class DocumentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer documentTypeId;

    @Column(nullable = false, length = 45)
    private String documentTypeName;

    // Conexion de la tabla DocumentType con la tabla PersonalData
    @OneToMany(mappedBy = "documentType", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<PersonalData> personalDataList;
}
