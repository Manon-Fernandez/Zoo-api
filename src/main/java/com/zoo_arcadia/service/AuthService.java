package com.zoo_arcadia.service;

import com.zoo_arcadia.security.models.Utilisateur;
import com.zoo_arcadia.security.payload.repository.UtilisateurRepository;
import com.zoo_arcadia.security.payload.request.SignupRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class AuthService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void changePassword(@Valid SignupRequest utilisateur){
        Optional<Utilisateur> oldUtilisateur = this.utilisateurRepository.findByEmail(utilisateur.getEmail());
        if(oldUtilisateur.isPresent()){
            Utilisateur monUtilisateur = oldUtilisateur.get();
            monUtilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
            this.utilisateurRepository.save(monUtilisateur);
        }
    }
}
