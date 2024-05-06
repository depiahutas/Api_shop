package com.loparok.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String denomination;

    private Date created_at;

    private Date updated_date;

    private String commentary;

    private String lon_lat;

    private String country_code;


}
