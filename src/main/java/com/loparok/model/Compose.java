package com.loparok.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Compose {
    
    @ManyToOne
    @JoinColumn(name = "OBJ_ID")
    private Object Obj_Id;

    @ManyToOne
    @JoinColumn(name = "COM_ID")
    private Component Com_Id;

}
