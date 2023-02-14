package com.muktai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muktai.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
