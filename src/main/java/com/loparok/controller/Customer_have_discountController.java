package com.loparok.controller;

import com.loparok.model.Customer_have_discount;
import com.loparok.repository.Customer_have_discountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/CustomerHaveDiscount")
public class Customer_have_discountController {

    @Autowired
    private Customer_have_discountRepository Customer_have_discountRepository;

    @GetMapping()
    public List<Customer_have_discount> getAllCustomer_have_discount() throws Exception {

        List<Customer_have_discount> entities = Customer_have_discountRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Customer_have_discount> getCustomer_have_discount(@PathVariable Integer id)throws Exception{

        return Customer_have_discountRepository.findById(id);
    }
}