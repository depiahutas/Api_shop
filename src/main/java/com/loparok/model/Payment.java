package com.loparok.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@ManyToOne
private Order_as id_order;

private String reference;

private String method;

private Date date;

private BigDecimal amount;
}
