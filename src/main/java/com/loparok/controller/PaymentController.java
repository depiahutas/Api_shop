package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Payment;
import com.loparok.repository.PaymentRepository;

@RestController
@RequestMapping("/Payment")
public class PaymentController {

    @Autowired
    private PaymentRepository Repository;

    @GetMapping()
    public List<Payment> getAllPayment() throws Exception {

        List<Payment> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Payment> getPayment(@PathVariable Integer id)throws Exception{

        return Repository.findById(id);
    }

}