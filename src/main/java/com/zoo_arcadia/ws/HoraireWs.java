package com.zoo_arcadia.ws;

import com.zoo_arcadia.pojo.Horaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zoo_arcadia.service.HoraireService;

import java.util.List;

@RestController
@RequestMapping(value = "horaire")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HoraireWs {

    @Autowired
    private HoraireService horaireService;

    @GetMapping
    public List<Horaire> getAllHoraires(){return horaireService.getAllHoraires();}

    @PostMapping
    public void createHoraire(@RequestBody Horaire horaire){horaireService.createHoraire(horaire);}

    @PutMapping("/{id}")
    public void updateHoraire(@PathVariable("id") Long id,
                              @RequestBody Horaire horaire){
        horaireService.updateHoraire(id, horaire);
    }

    @DeleteMapping("/{id}")
    public void deleteHoraireById(@PathVariable("id") Long id){horaireService.deleteHoraireById(id);}
}
