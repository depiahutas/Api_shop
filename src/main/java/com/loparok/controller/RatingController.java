package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Rating;
import com.loparok.repository.RatingRepository;

@RestController
@RequestMapping("/Rating")
public class RatingController {

    @Autowired
    private RatingRepository Repository;

    @GetMapping()
    public List<Rating> getAllRating() throws Exception {

        List<Rating> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Rating> getRating(@PathVariable Integer id)throws Exception{

        return Repository.findById(id);
    }

}