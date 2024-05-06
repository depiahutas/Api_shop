package com.loparok.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Product_have_discount {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private Product id_product_as;

private Discount id_discount;

}
