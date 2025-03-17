package com.emprendimientos.udea_emprende.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.emprendimientos.udea_emprende.model.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Integer> {

}
