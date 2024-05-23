package com.zoo_arcadia.service;

import com.zoo_arcadia.pojo.ServiceZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.zoo_arcadia.repository.ServiceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ZooService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceZoo> getAllServices() {return this.serviceRepository.findAll();}

    @PostMapping
    public void createService(@RequestBody ServiceZoo serviceZoo) {this.serviceRepository.save(serviceZoo);}

    public void updateService(Long id, ServiceZoo serviceZoo) {
        Optional<ServiceZoo> serviceOptional = this.serviceRepository.findById(id);
        if (serviceOptional.isPresent()){
            ServiceZoo serviceToSave = serviceOptional.get();
            serviceToSave.setNom(serviceZoo.getNom());
            serviceToSave.setDescription(serviceZoo.getDescription());
            this.serviceRepository.save(serviceToSave);
        }
    }

    public void deleteService(Long id) {this.serviceRepository.deleteById(id);}

}
