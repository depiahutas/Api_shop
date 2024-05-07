package com.loparok.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Label;
import com.loparok.repository.LabelRepository;



@RestController
@RequestMapping("/Label")
public class LabelController {
    @Autowired
    private LabelRepository LabelRepository;

    @GetMapping()
    public List<Label> getAllLabel() throws Exception {

        List<Label> entities = LabelRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Label> getLabel(@PathVariable Integer id)throws Exception{

        return LabelRepository.findById(id);
    }
}
