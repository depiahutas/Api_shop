package com.loparok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loparok.model.Rating;

public interface RatingRepository  extends JpaRepository<Rating, Long>{

}
