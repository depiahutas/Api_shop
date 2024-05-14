package com.loparok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Media;
import com.loparok.repository.MediaRepository;

@RestController
@RequestMapping("/Media")
public class MediaController {

    @Autowired
    private MediaRepository Repository;

    @GetMapping()
    public List<Media> getAllMedia() throws Exception {

        List<Media> entities = Repository.findAll();
        return entities;
    }

    @GetMapping("/{id}")
    public Optional<Media> getMedia(@PathVariable Integer id)throws Exception{

        return Repository.findById(id);
    }

    @GetMapping("/product={id}")
    public List<Media> getMediaByProduct(@PathVariable Integer id)throws Exception{

        List<Media> entities = Repository.findByProductId(id);
        return entities;
    }

}