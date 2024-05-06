package com.loparok.repository;

import com.loparok.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository  extends JpaRepository<Basket, Integer> {
}
