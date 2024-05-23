package com.zoo_arcadia.repository;

import com.zoo_arcadia.pojo.Habitat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitatRepository extends JpaRepository<Habitat,Long> {
}
