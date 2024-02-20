package com.negosud.api.controller;

import com.negosud.api.model.Familles;
import com.negosud.api.service.FamillesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9000/")
public class FamillesController {

    @Autowired
    private FamillesService famillesService;

    @GetMapping("/familles")
    public Iterable<Familles> getFamilles() {
        return famillesService.getFamilles();
    }

    @GetMapping("/familles/{id}")
    public Optional<Familles> getFamille(Long id) {
        return famillesService.getFamille(id);
    }

    @DeleteMapping("/familles/{id}")
    public void deleteFamille(final Long id) {
        famillesService.deleteFamille(id);
    }

    @PutMapping("/familles")
    public Familles saveFamille(Familles familles)  {
        return famillesService.saveFamille(familles);
    }
}
