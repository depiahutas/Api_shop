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
public class Label {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private int ecolo;

private String name;

private String made_in;

}