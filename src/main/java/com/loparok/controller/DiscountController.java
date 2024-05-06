package com.loparok.controller;

import com.loparok.model.Discount;
import com.loparok.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping("/Discount")
public class DiscountController {

    @Autowired
    private DiscountRepository DiscountRepository;

    @GetMapping()
    public List<Discount> getAllDiscount() throws Exception {

        List<Discount> entities = DiscountRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Discount> getDiscount(Integer id)throws Exception{

        return DiscountRepository.findById(id);
    }
}