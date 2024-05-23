package com.zoo_arcadia.security.payload.repository;

import com.zoo_arcadia.security.models.ERole;
import com.zoo_arcadia.security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    static Optional<Role> findByName(ERole name) {
        return null;
    }
}
