package com.zoo_arcadia.service;

import com.zoo_arcadia.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ContactService {


    private JavaMailSender javaMailSender;

    @Value("${zoo.app.mail}")
    private String mailZoo;

    public void sendMailToZoo(Contact contact) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(mailZoo);
        mailMessage.setSubject(contact.getTitle());
        mailMessage.setFrom(mailZoo);
        mailMessage.setReplyTo(mailZoo);
        mailMessage.setText("Vous avez été contacté par " + contact.getPseudo() + " " + ", pour le motif suivant : " + contact.getDescription() + ", vous pouvez le contacter par mail : " + contact.getMail());
        javaMailSender.send(mailMessage);

    }
}
