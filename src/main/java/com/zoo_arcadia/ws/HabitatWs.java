package com.zoo_arcadia.ws;

import com.zoo_arcadia.pojo.Habitat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zoo_arcadia.service.HabitatService;

import java.util.List;

@RestController
@RequestMapping(value = "habitat")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class HabitatWs {

    @Autowired
    private HabitatService habitatService;

    @GetMapping
    public List<Habitat> getAllHabitats() {return this.habitatService.getAllHabitats();}

    @PostMapping
    public void createHabitat(@RequestBody Habitat habitat) {
        this.habitatService.createHabitat(habitat);
    }

    @PutMapping("/{id}")
    public void updateHabitat(@PathVariable("id") Long id,
                              @RequestBody Habitat habitat) {
        this.habitatService.updateHabitat(id, habitat);
    }

    @DeleteMapping("/{id}")
    public void deleteHabitat(@PathVariable("id") Long id) {this.habitatService.deleteHabitat(id);}

}
