package com.loparok.controller;

import com.loparok.model.Address;
import com.loparok.repository.AddressRepository;
import com.loparok.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AddressController {

    @Autowired
    private AddressRepository AddressRepository;

    @GetMapping()
    public List<Address> getAllAddress() throws Exception {

        List<Address> entities = AddressRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Address> getAddress(Long id)throws Exception{

        return AddressRepository.findById(id);
    }