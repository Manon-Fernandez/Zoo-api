package com.zoo_arcadia.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name ="sante")
@Getter
@Setter
public class Sante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="sante_id")
    private Long id;

    private String etat_animal;

    private String nourriture;

    private Float grammage;

    private Date date_passage;


}
