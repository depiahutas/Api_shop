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
public class Job {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    private String Job_Name;

}
