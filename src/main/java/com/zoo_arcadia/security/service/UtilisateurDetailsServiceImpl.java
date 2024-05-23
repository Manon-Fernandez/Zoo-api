package com.zoo_arcadia.security.service;

import com.zoo_arcadia.security.models.Utilisateur;
import com.zoo_arcadia.security.payload.repository.UtilisateurRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UtilisateurRepository utilisateurRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + email));

        return UtilisateurDetailsImpl.build(utilisateur);
    }

}
