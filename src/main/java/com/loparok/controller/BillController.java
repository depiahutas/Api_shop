package com.loparok.controller;

import com.loparok.model.Bill;
import com.loparok.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/Bill")
public class BillController {

    @Autowired
    private BillRepository BillRepository;

    @GetMapping()
    public List<Bill> getAllBill() throws Exception {

        List<Bill> entities = BillRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Bill> getBill(Integer id)throws Exception{

        return BillRepository.findById(id);
    }
}