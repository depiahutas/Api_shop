package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Order_as;
import com.loparok.repository.Order_asRepository;

@RestController
@RequestMapping("/Order")
public class Order_asController {

    @Autowired
    private Order_asRepository Repository;

    @GetMapping()
    public List<Order_as> getAllOrder_as() throws Exception {

        List<Order_as> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Order_as> getOrder_as(@PathVariable Integer id)throws Exception{

        return Repository.findById(id);
    }

}