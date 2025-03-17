package com.emprendimientos.udea_emprende.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USER_TYPE")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userTypeId;

    @Column(nullable = false, length = 100)
    private String userTypeName;

}
