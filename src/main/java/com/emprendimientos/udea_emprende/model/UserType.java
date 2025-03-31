package com.emprendimientos.udea_emprende.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name = "USER_TYPE")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userTypeId;

    @Column(nullable = false, length = 50)
    private String userTypeName;

    // Relacion de 1:N con Roles
    @OneToMany(mappedBy = "userType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore // Evita recursión en JSON
    @ToString.Exclude // Evita recursión en toString()
    @EqualsAndHashCode.Exclude // Evita recursión en equals() y hashCode()
    private List<Role> roles;
}
