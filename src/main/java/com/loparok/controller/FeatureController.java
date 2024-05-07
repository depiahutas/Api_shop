package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Feature;
import com.loparok.repository.FeatureRepository;

@RestController
@RequestMapping("/Feature")
public class FeatureController {

    @Autowired
    private FeatureRepository FeatureRepository;

    @GetMapping()
    public List<Feature> getAllFeature() throws Exception {

        List<Feature> entities = FeatureRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Feature> getFeature(@PathVariable Integer id)throws Exception{

        return FeatureRepository.findById(id);
    }

}
