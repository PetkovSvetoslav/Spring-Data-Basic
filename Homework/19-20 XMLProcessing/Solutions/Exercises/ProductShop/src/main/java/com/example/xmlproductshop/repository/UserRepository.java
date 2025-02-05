package com.example.xmlproductshop.repository;

import com.example.xmlproductshop.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User AS u " +
            "JOIN Product AS p " +
            "ON u.id = p.seller.id " +
            "WHERE p.buyer IS NOT NULL " +
            "GROUP BY u.id " +
            "ORDER BY u.lastName, u.firstName")
    List<User> findAllWithMoreThanOneSoldProductOrderedByLastNameThenFirstName();

    @Query("SELECT u FROM User AS u " +
            "JOIN Product AS p " +
            "ON u.id = p.seller.id " +
            "WHERE p.buyer IS NOT NULL " +
            "GROUP BY u.id")
    List<User> findAllWithMoreThanOneSoldProduct();
}
