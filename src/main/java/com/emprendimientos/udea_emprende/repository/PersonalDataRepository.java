package com.emprendimientos.udea_emprende.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emprendimientos.udea_emprende.model.PersonalData;

@Repository
public interface PersonalDataRepository extends JpaRepository<PersonalData, Integer> {
}
