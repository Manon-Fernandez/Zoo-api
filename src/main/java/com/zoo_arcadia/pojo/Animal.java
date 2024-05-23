package com.zoo_arcadia.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="animal")
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="animal_id")
    private Long id;

    private String prenom;

    private String race;

    @Lob
    private byte[] image;

}
