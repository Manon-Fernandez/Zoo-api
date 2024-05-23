package com.zoo_arcadia.service;

import com.zoo_arcadia.pojo.Habitat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.zoo_arcadia.repository.HabitatRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HabitatService {

    @Autowired
    private HabitatRepository habitatRepository;

    public List<Habitat> getAllHabitats() {return this.habitatRepository.findAll();}

    @PostMapping
    public void createHabitat(@RequestBody Habitat habitat) {this.habitatRepository.save(habitat);}

    public void updateHabitat(Long id, Habitat habitat) {
        Optional<Habitat> habitatOptional = this.habitatRepository.findById(id);
        if(habitatOptional.isPresent()) {
            Habitat habitatToSave = habitatOptional.get();
            habitatToSave.setNom(habitat.getNom());
            habitatToSave.setDescription(habitat.getDescription());
            this.habitatRepository.save(habitatToSave);
        }
    }

    public void deleteHabitat(Long id) {this.habitatRepository.deleteById(id);}

}
