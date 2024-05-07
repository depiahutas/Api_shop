package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Enterprise_have_products;
import com.loparok.repository.Enterprise_have_procuctsRepository;

@RestController
@RequestMapping("/EnterpriseHaveProducts")
public class Enterprise_have_productsController {

@Autowired
    private Enterprise_have_procuctsRepository Enterprise_have_productsRepository;

    @GetMapping()
    public List<Enterprise_have_products> Enterprise_have_products() throws Exception {

        List<Enterprise_have_products> entities = Enterprise_have_productsRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Enterprise_have_products> Enterprise_have_products(@PathVariable Integer id)throws Exception{

        return Enterprise_have_productsRepository.findById(id);
    }
}
