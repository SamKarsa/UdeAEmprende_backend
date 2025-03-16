package com.emprendimientos.udea_emprende.model;

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
}
