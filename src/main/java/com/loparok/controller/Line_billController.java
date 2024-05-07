package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Line_bill;
import com.loparok.repository.Line_billRepository;

@RestController
@RequestMapping("/LineBasket")
public class Line_billController {

    @Autowired
    private Line_billRepository Repository;

    @GetMapping()
    public List<Line_bill> getAllLine_bill() throws Exception {

        List<Line_bill> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Line_bill> getLine_bill(Integer id)throws Exception{

        return Repository.findById(id);
    }

}