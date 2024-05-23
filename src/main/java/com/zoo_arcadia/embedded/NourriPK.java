package com.zoo_arcadia.embedded;

import com.zoo_arcadia.pojo.Animal;
import com.zoo_arcadia.security.models.Utilisateur;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class NourriPK {

    @ManyToOne
    @JoinColumn(name="utilisateur_id")
    private Utilisateur utilisateur_id;

    @ManyToOne
    @JoinColumn(name="animal_id")
    private Animal animal_id;
}
