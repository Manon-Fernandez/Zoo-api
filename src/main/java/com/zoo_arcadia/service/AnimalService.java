package com.zoo_arcadia.service;

import com.zoo_arcadia.pojo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.zoo_arcadia.repository.AnimalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {return this.animalRepository.findAll();}

    @PostMapping
    public void createAnimal(@RequestBody Animal animal) {this.animalRepository.save(animal);}

    public void updateAnimal(Long id, Animal animal) {
        Optional<Animal> animalOptional = this.animalRepository.findById(id);
        if (animalOptional.isPresent()){
            Animal animalToSave = animalOptional.get();
            animalToSave.setPrenom(animal.getPrenom());
            animalToSave.setRace(animal.getRace());
            animalToSave.setImage(animal.getImage());
            this.animalRepository.save(animalToSave);
        }
    }

    public void deleteAnimal(Long id) {this.animalRepository.deleteById(id);}

}
