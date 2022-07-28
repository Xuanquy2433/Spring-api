/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Java5.Java5.repository;

import com.Java5.Java5.domain.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Xuan Quy
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    // @Query("SELECT p FROM Product p WHERE p.name LIKE %?%")
    // public List<Product> search(String keyword);
}
