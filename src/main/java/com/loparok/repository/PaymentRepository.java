package com.loparok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loparok.model.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Integer>{

}
