package com.zoo_arcadia.pojo;

import com.zoo_arcadia.pojo.state.Status;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="avis")
@Getter
@Setter
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avis_id")
    private Long id;

    private String pseudo;

    private String commentaire;

    @Enumerated(EnumType.STRING)
    private Status status;

}
