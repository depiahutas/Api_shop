package com.loparok.controller;

import com.loparok.model.Delivery;
import com.loparok.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/")
public class DeliveryController {

    @Autowired
    private DeliveryRepository DeliveryRepository;

    @GetMapping()
    public List<Delivery> getAllDelivery() throws Exception {

        List<Delivery> entities = DeliveryRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Delivery> getDelivery(Long id)throws Exception{

        return DeliveryRepository.findById(id);
    }
}