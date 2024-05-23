package com.zoo_arcadia.ws;

import com.zoo_arcadia.pojo.ServiceZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zoo_arcadia.service.ZooService;

import java.util.List;

@RestController
@RequestMapping(value = "service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ServiceWs {

    @Autowired
    private ZooService zooService;

    @GetMapping
    public List<ServiceZoo> getAllServices(){return this.zooService.getAllServices();}

    @PostMapping
    public void createService(@RequestBody ServiceZoo serviceZoo){
        this.zooService.createService(serviceZoo);
    }

    @PutMapping("/{id}")
    public void updateService(@PathVariable("id") Long id,
                              @RequestBody ServiceZoo serviceZoo){
        this.zooService.updateService(id, serviceZoo);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable("id") Long id){this.zooService.deleteService(id);}

}
