package com.emprendimientos.udea_emprende.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.emprendimientos.udea_emprende.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
