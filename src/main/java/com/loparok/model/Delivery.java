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
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Long id_order;

    private Date sending_date;

    private String carrier_name;

    private Long tracked_number;

    private String url;

    private String weight;

    private Date created_at;

    private Date updated_date;

    private Date estimated_time;

}
