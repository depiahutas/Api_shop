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
public class Product {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@ManyToOne
@JoinColumn(name = "id_vat")
private Vat id_vat;

@ManyToOne
@JoinColumn(name = "id_feature")
private Feature id_feature;

@ManyToOne
@JoinColumn(name = "id_label")
private Label id_label;

@ManyToOne
@JoinColumn(name = "id_category")
private Category id_category;

private String product_name;

private String product_description;

private BigDecimal product_price;
}
