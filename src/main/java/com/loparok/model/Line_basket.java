package com.loparok.model;

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
public class Line_basket {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@ManyToOne
private Basket id_basket;

@ManyToOne
private Product id_procuct;

private int quantity;

private int amount;

private float amount_discount;

}