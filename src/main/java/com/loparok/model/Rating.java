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
public class Rating {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@ManyToOne
@JoinColumn(name = "id_product_as")
private Product id_product_as ;

@ManyToOne
@JoinColumn(name = "id_customer")
private Customer id_customer ;

private int star;

private String opinion;

private String title;

private Date date;
}
