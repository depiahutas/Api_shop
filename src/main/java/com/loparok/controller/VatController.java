package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Vat;
import com.loparok.repository.VatRepository;

@RestController
@RequestMapping("/Vat")
public class VatController {

    @Autowired
    private VatRepository Repository;

    @GetMapping()
    public List<Vat> getAllVat() throws Exception {

        List<Vat> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Vat> getVat(@PathVariable Integer id)throws Exception{

        return Repository.findById(id);
    }

}