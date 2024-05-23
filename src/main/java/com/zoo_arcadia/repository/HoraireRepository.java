package com.zoo_arcadia.repository;

import com.zoo_arcadia.pojo.Horaire;
import com.zoo_arcadia.pojo.state.Jour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HoraireRepository extends JpaRepository<Horaire,Long> {
    Optional<Horaire> findHoraireByJour(Jour jour);
}
