package com.loparok.model;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonProperty;
>>>>>>> 15a308a8a3fbe079e1ec844df5b7eb38003bc4fb
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String logo;

    private String social_reason;

    private String email;

    private String password;

    private Long phone;

    private String address;

    private String cin;

<<<<<<< HEAD
}
=======
}
>>>>>>> 15a308a8a3fbe079e1ec844df5b7eb38003bc4fb
