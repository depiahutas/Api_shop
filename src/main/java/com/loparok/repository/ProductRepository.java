package com.loparok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loparok.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
