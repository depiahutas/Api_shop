package com.loparok.model;

import java.sql.Date;

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
public class Payment {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@ManyToOne
private Order_as id_order;

private String reference;

private String method;

private Date date;

private float amount;
}
