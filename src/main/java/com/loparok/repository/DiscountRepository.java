package com.loparok.repository;

import com.loparok.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository  extends JpaRepository<Discount, Integer> {
}
