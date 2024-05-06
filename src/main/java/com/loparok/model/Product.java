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
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@ManyToOne
private Vat id_vat;

@ManyToOne
private Feature id_feature;

@ManyToOne
private Label id_label;

@ManyToOne
private Category id_category;

@ManyToOne
private Discount id_discount;

private String product_name;

private String product_description;
}
