package com.loparok.controller;

import com.loparok.model.Basket;
import com.loparok.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/Basket")
public class BasketController {

    @Autowired
    private BasketRepository BasketRepository;

    @GetMapping()
    public List<Basket> getAllBasket() throws Exception {

        List<Basket> entities = BasketRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Basket> getBasket(@PathVariable Integer id)throws Exception{

        return BasketRepository.findById(id);
    }
}