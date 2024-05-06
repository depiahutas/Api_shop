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
public class Feature {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private int weight;

private String unit;

private int width;

private int height;

private String color;

private int is_metric;

}
