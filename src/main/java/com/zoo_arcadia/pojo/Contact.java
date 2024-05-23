package com.zoo_arcadia.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {

    private String title;

    private String pseudo;

    private String mail;

    private String description;

    public Contact(String title, String pseudo, String mail, String description) {
        this.title = title;
        this.pseudo = pseudo;
        this.mail = mail;
        this.description = description;
    }

    public Contact() {
    }
}
