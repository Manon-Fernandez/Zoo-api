package com.zoo_arcadia.ws;

import com.zoo_arcadia.pojo.dto.UtilisateurDTO;
import com.zoo_arcadia.security.payload.repository.UtilisateurRepository;
import com.zoo_arcadia.security.payload.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("utilisateur")
public class UtilisateurWs {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUtilisateur(@PathVariable Long id) {
        utilisateurRepository.deleteById(id);
        return ResponseEntity.ok(new MessageResponse("User deleted successfully!"));
    }

    @GetMapping
    public List<UtilisateurDTO> getAllEmployes() {
        return utilisateurRepository.findUtilisateurByRoles("EMPLOYE").stream()
                .map(user -> new UtilisateurDTO(user.getId(), user.getEmail()))
                .collect(Collectors.toList());
    }
}
