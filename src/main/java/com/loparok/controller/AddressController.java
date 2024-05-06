package com.loparok.controller;

import com.loparok.model.Address;
import com.loparok.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/Address")
public class AddressController {

    @Autowired
    private AddressRepository AddressRepository;

    @GetMapping()
    public List<Address> getAllAddress() throws Exception {

        List<Address> entities = AddressRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Address> getAddress(Integer id)throws Exception{

        return AddressRepository.findById(id);
    }
}