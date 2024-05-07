package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Product;
import com.loparok.repository.ProductRepository;

@RestController
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private ProductRepository Repository;

    @GetMapping()
    public List<Product> getAllProduct() throws Exception {

        List<Product> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable Integer id)throws Exception{

        return Repository.findById(id);
    }

}