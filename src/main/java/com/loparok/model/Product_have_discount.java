package com.loparok.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@JoinColumn(name = "id_product_as")
private Product id_product_as;

@ManyToOne
@JoinColumn(name = "id_discount")
private Discount id_discount;

}
