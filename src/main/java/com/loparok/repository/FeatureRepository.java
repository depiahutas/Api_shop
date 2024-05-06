package com.loparok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loparok.model.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Long>{

}
