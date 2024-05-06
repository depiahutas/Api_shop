package com.loparok.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Order_as {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private Basket id_basket;

private Customer id_customer;

private Discount id_discount;

private String reference;

private int status;

private Date purchase_date;

private Date order_update;

}
