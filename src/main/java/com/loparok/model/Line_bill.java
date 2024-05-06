package com.loparok.model;

import java.math.BigDecimal;

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
public class Line_bill {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@ManyToOne
private Bill id_bill;

private BigDecimal amount_discount;

private BigDecimal amount_tva;

private int quantity;

private BigDecimal amount_total;

}
