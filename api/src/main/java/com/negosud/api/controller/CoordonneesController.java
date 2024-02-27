package com.negosud.api.controller;

import com.negosud.api.model.Coordonnees;
import com.negosud.api.service.CoordonneesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9300/")
public class CoordonneesController {

    @Autowired
    private CoordonneesService coordonneesService;

    @GetMapping("/coordonnees")
    public Iterable<Coordonnees> getCoordonnees() {
        return coordonneesService.getCoordonnees();
    }

    @GetMapping("/coordonnees/{id}")
    public Optional<Coordonnees> getCoordonnee(@PathVariable Long id) {
        return coordonneesService.getCoordonnee(id);
    }

    @DeleteMapping("/coordonnees/{id}")
    public void deleteCoordonnee(@PathVariable final Long id) {
        coordonneesService.deleteCoordonnee(id);
    }

    @PutMapping("/coordonnees")
    public Coordonnees updateCoordonnee(@RequestBody Coordonnees coordonnees)  {
        return coordonneesService.updateCoordonnee(coordonnees);
    }
    @PostMapping("/coordonnees")
    public Coordonnees saveCoordonnee(@RequestBody Coordonnees coordonnees)  {
        return coordonneesService.saveCoordonnee(coordonnees);
    }
}
