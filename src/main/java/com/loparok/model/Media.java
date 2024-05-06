package com.loparok.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Media {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private Product id_product_as;

private String name;

private String url;

}
