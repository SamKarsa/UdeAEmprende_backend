package com.emprendimientos.udea_emprende.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class UserLogInSesion {
    private String email;
    private String password;
    private Boolean userStatus;
    private Integer userId;

}
