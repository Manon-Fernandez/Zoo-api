package com.zoo_arcadia.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="habitat")
@Getter
@Setter
public class Habitat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="habitat_id")
    private Long id;

    private String nom;

    private String description;

}
