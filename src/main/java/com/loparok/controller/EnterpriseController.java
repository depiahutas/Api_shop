package com.loparok.controller;

import com.loparok.model.Enterprise;
import com.loparok.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseRepository EnterpriseRepository;

    @GetMapping()
    public List<Enterprise> getAllEnterprise() throws Exception {

        List<Enterprise> entities = EnterpriseRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Enterprise> getEnterprise(Integer id)throws Exception{

        return EnterpriseRepository.findById(id);
    }
}