package com.example.xmlproductshop.repository;

import com.example.xmlproductshop.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("SELECT c.name, SIZE (c.products), AVG (p.price), SUM(p.price) " +
            "FROM Category AS c " +
            "JOIN c.products AS p " +
            "GROUP BY c.name " +
            "ORDER BY SIZE (c.products) DESC")
    List<Object[]> findAllOrderedByNumberOfProducts();
}
