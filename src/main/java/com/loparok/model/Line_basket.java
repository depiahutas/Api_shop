package com.loparok.model;

import java.math.BigDecimal;

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
public class Line_basket {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@ManyToOne
@JoinColumn(name = "id_basket")
private Basket id_basket;

@ManyToOne
@JoinColumn(name = "id_product_as")
private Product id_procuct_as;

private int quantity;

private int amount;

private BigDecimal amount_discount;

}
