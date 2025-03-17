package com.emprendimientos.udea_emprende.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emprendimientos.udea_emprende.model.UserType;

import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Integer> {
}
