package com.zoo_arcadia.security.payload.repository;

import com.zoo_arcadia.security.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findByEmail(String email);

    Boolean existsByEmail(String email);

    @Query(value = "SELECT u.* FROM utilisateur u " +
            "JOIN utilisateur_roles ur ON ur.utilisateur_id = u.id " +
            "JOIN roles r ON r.id = ur.role_id " +
            "WHERE r.name = ?1",
            nativeQuery = true)
    List<Utilisateur> findUtilisateurByRoles(String role);
}
