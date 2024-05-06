package com.loparok.controller;

import com.loparok.model.Category;
import com.loparok.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/")
public class CategoryController {

    @Autowired
    private CategoryRepository CategoryRepository;

    @GetMapping()
    public List<Category> getAllCategory() throws Exception {

        List<Category> entities = CategoryRepository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategory(Long id)throws Exception{

        return CategoryRepository.findById(id);
    }
}