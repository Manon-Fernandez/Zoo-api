package com.zoo_arcadia.ws;

import com.zoo_arcadia.security.jwt.JwtUtilis;
import com.zoo_arcadia.security.models.ERole;
import com.zoo_arcadia.security.models.Role;
import com.zoo_arcadia.security.models.Utilisateur;
import com.zoo_arcadia.security.payload.repository.RoleRepository;
import com.zoo_arcadia.security.payload.repository.UtilisateurRepository;
import com.zoo_arcadia.security.payload.request.LoginRequest;
import com.zoo_arcadia.security.payload.request.SignupRequest;
import com.zoo_arcadia.security.payload.response.JwtResponse;
import com.zoo_arcadia.security.payload.response.MessageResponse;
import com.zoo_arcadia.security.service.UtilisateurDetailsImpl;
import com.zoo_arcadia.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    RoleRepository repository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtilis jwtUtilis;

    @Autowired
    AuthService authService;

    @PostMapping("signin")
    public ResponseEntity<?> authenticateUtilisateur(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtilis.generateJwtToken(authentication);

        UtilisateurDetailsImpl utilisateurDetails = (UtilisateurDetailsImpl) authentication.getPrincipal();
        List<String> roles = utilisateurDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        return ResponseEntity.ok(new JwtResponse(jwt,
                utilisateurDetails.getId(),
                utilisateurDetails.getUsername(),
                roles));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUtilisateur(@Valid @RequestBody SignupRequest signUpRequest) {
        if (utilisateurRepository.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already taken!"));
        }

        // Create new user's account
        Utilisateur utilisateur = new Utilisateur(signUpRequest.getEmail(),
                encoder.encode(signUpRequest.getPassword()));

        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            Role utilisateurRole = RoleRepository.findByName(ERole.EMPLOYE)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(utilisateurRole);
        }
        else {
            strRoles.forEach(role -> {
                switch (role) {
                    case "ADMIN":
                        Role adminRole = RoleRepository.findByName(ERole.ADMIN)
                                .orElseThrow(null);
                        roles.add(adminRole);
                        break;
                    case "VETERINAIRE":
                        Role veterinaireRole = RoleRepository.findByName(ERole.VETERINAIRE)
                                .orElseThrow(null);
                        roles.add(veterinaireRole);
                        break;
                    default:
                        Role utilisateurRole = RoleRepository.findByName(ERole.EMPLOYE)
                                .orElseThrow(null);
                        roles.add(utilisateurRole);
                }
            });
        }

        utilisateur.setRoles(roles);
        utilisateurRepository.save(utilisateur);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }

    @PutMapping("/changePassword")
    public void changePassword (@Valid @RequestBody SignupRequest signupRequest){
        this.authService.changePassword(signupRequest);
    }

}
