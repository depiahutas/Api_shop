package com.loparok.repository;

import com.loparok.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository  extends JpaRepository<Delivery, Long> {
}
