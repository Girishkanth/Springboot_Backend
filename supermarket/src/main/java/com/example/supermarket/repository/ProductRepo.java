package com.example.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supermarket.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
