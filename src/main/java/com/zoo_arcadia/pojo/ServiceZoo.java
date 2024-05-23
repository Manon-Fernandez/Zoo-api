package com.zoo_arcadia.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="service")
@Getter
@Setter
public class ServiceZoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="service_id")
    private Long id;

    private String nom;

    private String description;
}
