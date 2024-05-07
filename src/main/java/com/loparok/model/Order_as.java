package com.loparok.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Order_as {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@ManyToOne
@JoinColumn(name = "id_basket")
private Basket id_basket;

@ManyToOne
@JoinColumn(name = "id_customer")
private Customer id_customer;

@ManyToOne
@JoinColumn(name = "id_discount")
private Discount id_discount;

private String reference;

private int status;

private Date purchase_date;

private Date order_update;

}
