package com.zoo_arcadia.pojo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UtilisateurDTO {

    private Long id;

    private String email;

    public UtilisateurDTO(Long id, String email) {
        this.id = id;
        this.email = email;
    }

}
