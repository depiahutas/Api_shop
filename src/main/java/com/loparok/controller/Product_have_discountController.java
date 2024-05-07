package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Product_have_discount;
import com.loparok.repository.Product_have_discountRepository;

@RestController
@RequestMapping("/Product_have_discount")
public class Product_have_discountController {

    @Autowired
    private Product_have_discountRepository Repository;

    @GetMapping()
    public List<Product_have_discount> getAllProduct_have_discount() throws Exception {

        List<Product_have_discount> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Product_have_discount> getProduct_have_discount(@PathVariable Integer id)throws Exception{

        return Repository.findById(id);
    }

}