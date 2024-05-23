package com.zoo_arcadia.repository;

import com.zoo_arcadia.pojo.Avis;
import com.zoo_arcadia.pojo.state.Status;
import jdk.jshell.Snippet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvisRepository extends JpaRepository<Avis,Long> {
    List<Avis> findAllAvisByStatus(Status status);
}
