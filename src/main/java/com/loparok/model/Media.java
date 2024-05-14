package com.loparok.model;

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
public class Media {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@ManyToOne
@JoinColumn(name = "id_product_as")
private Product product;

private String name;

private String url;

}
