package com.zoo_arcadia.repository;

import com.zoo_arcadia.pojo.ServiceZoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceZoo,Long> {
}
