package com.alura.technologiesapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechnologiesController {
    
    @Autowired
    private LanguageRepository repositorio;

    @GetMapping("/technologies")
    public List<Technology> getTechnologies(){
        return repositorio.findAll(Sort.by(Sort.Direction.ASC, "ranking")); //sorting the datas by ranking
    }

    @PostMapping("/technologies")
    public Technology postTechnology(@RequestBody Technology tech){
        Technology techSaved = repositorio.save(tech);
        return techSaved;
    }

    @DeleteMapping("/technologies")
    public void deleteTechnology(@RequestBody Technology tech){
        repositorio.delete(tech);
    }
}
