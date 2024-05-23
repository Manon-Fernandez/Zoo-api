package com.zoo_arcadia.repository;

import com.zoo_arcadia.pojo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
}
