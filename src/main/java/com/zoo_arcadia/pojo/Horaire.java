package com.zoo_arcadia.pojo;

import com.zoo_arcadia.pojo.state.Jour;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="horaire")
@Getter
@Setter
public class Horaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_horaire")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Jour jour;

    private String heure_ouverture;

    private String heure_fermeture;

}
