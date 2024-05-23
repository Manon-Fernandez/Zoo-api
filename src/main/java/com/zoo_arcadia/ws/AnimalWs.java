package com.zoo_arcadia.ws;

import com.zoo_arcadia.pojo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zoo_arcadia.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping(value = "animal")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AnimalWs {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {return this.animalService.getAllAnimals();}

    @PostMapping
    public void createAnimal(@RequestBody Animal animal) {
        this.animalService.createAnimal(animal);
    }

    @PutMapping("/{id}")
    public void updateAnimal(@PathVariable("id") Long id,
                             @RequestBody Animal animal){
        this.animalService.updateAnimal(id,animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable("id") Long id) {this.animalService.deleteAnimal(id);}

}
