package com.loparok.controller;

import com.loparok.model.Customer;
import com.loparok.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerRepository CustomerRepository;

    @GetMapping()
    public List<Customer> getAllCustomer() throws Exception {

        List<Customer> entities = CustomerRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomer(Integer id)throws Exception{

        return CustomerRepository.findById(id);
    }
}