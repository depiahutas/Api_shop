package com.loparok.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Product_have_discount {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@ManyToOne
private Product id_product_as;

@ManyToOne
private Discount id_discount;

}
