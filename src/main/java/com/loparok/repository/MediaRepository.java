package com.loparok.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loparok.model.Media;

public interface MediaRepository  extends JpaRepository<Media, Integer>{

    
    public List<Media> findByProductId(int id);

}
