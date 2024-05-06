package com.loparok.controller;

import com.loparok.model.Customer_have_address;
import com.loparok.repository.Customer_have_addressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/CustomerHaveAddress")
public class Customer_have_addressController {

    @Autowired
    private Customer_have_addressRepository Customer_have_addressRepository;

    @GetMapping()
    public List<Customer_have_address> getAllCustomer_have_address() throws Exception {

        List<Customer_have_address> entities = Customer_have_addressRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Customer_have_address> getCustomer_have_address(Integer id)throws Exception{

        return Customer_have_addressRepository.findById(id);
    }
}