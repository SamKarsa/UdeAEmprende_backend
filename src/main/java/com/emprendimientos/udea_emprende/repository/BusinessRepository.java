package com.emprendimientos.udea_emprende.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emprendimientos.udea_emprende.model.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Integer> {
    @Query("SELECT DISTINCT b FROM Business b JOIN b.businessCategories bc WHERE bc.category.categoryId = :categoryId")
    List<Business> findBusinessesByCategoryId(@Param("categoryId") Integer categoryId);

    @Query("SELECT DISTINCT b FROM Business b " +
            "LEFT JOIN b.businessCategories bc " +
            "LEFT JOIN bc.category c " +
            "WHERE (" +
            "   LOWER(b.businessName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "   LOWER(CAST(b.businessDescription AS string)) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "   LOWER(b.businessServiceHours) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "   LOWER(b.businessLocation) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "   LOWER(c.categoryName) LIKE LOWER(CONCAT('%', :query, '%')) " +
            ")")
    List<Business> searchBusinesses(@Param("query") String query);
}
