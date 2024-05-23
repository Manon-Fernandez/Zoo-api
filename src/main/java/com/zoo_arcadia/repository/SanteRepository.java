package com.zoo_arcadia.repository;

import com.zoo_arcadia.pojo.Sante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanteRepository extends JpaRepository<Sante,Long> {
}
