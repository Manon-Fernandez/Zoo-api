package com.zoo_arcadia.pojo;

import com.zoo_arcadia.embedded.NourriPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name ="nourri")
@Getter
@Setter
public class Nourri {

    @Id
    @EmbeddedId
    private NourriPK nourri_id;

    private Date date_nourriture;

    private Float grammage_nourriture;

}
