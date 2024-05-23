package com.zoo_arcadia.repository;

import com.zoo_arcadia.pojo.Nourri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NourriRepository extends JpaRepository<Nourri,Long> {
}
