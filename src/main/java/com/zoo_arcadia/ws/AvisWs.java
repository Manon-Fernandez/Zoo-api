package com.zoo_arcadia.ws;

import com.zoo_arcadia.pojo.Avis;
import com.zoo_arcadia.pojo.state.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zoo_arcadia.service.AvisService;

import java.util.List;

@RestController
@RequestMapping(value = "avis")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AvisWs {

    @Autowired
    private AvisService avisService;

    @GetMapping
    public List<Avis> getAllAvis(){return avisService.getAllAvis();}

    @GetMapping(value = "/status/{status}")
    public List<Avis> getAllAvisByStatus(@PathVariable Status status){return avisService.getAllAvisByStatus(status);}

    @PostMapping
    public void createAvis(@RequestBody Avis unAvis){this.avisService.createAvis(unAvis);}

    @PutMapping("/status/{status}")
    public void updateStatusAvis(@RequestBody Avis unAvis,
                                 @PathVariable(name ="status") Status status){
        this.avisService.updateStatusAvis(unAvis,status);
    }

    @DeleteMapping("/{id}")
    public void deleteAvisById(@PathVariable("id") Long id){this.avisService.deleteAvisById(id);}

}