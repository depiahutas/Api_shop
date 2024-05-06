package com.loparok.model;

import java.util.Date;

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
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Order_as id_order;

    private Date sending_date;

    private String carrier_name;

    private Long tracked_number;

    private String url;

    private String weight;

    private Date created_at;

    private Date updated_date;

    private Date estimated_time;

}
