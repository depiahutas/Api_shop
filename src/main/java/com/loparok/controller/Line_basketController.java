package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Line_basket;
import com.loparok.repository.Line_basketRepository;

@RestController
@RequestMapping("/LineBasket")
public class Line_basketController {

    @Autowired
    private Line_basketRepository Repository;

    @GetMapping()
    public List<Line_basket> getAllLine_basket() throws Exception {

        List<Line_basket> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Line_basket> getLine_basket(@PathVariable Integer id)throws Exception{

        return Repository.findById(id);
    }

}
