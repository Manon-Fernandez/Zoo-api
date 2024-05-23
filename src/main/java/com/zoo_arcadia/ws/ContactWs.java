package com.zoo_arcadia.ws;

import com.zoo_arcadia.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zoo_arcadia.service.ContactService;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping(value = "contact")
public class ContactWs {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public void sendMailToZoo(@RequestBody Contact contact) {
        this.contactService.sendMailToZoo(contact);
    }
}
