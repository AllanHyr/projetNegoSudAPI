package com.negosud.api.controller;

import com.negosud.api.model.Coordonnees;
import com.negosud.api.service.CoordonneesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CoordonneesController {

    @Autowired
    private CoordonneesService coordonneesService;

    @GetMapping("/coordonnees")
    public Iterable<Coordonnees> getCoordonnees() {
        return coordonneesService.getCoordonnees();
    }

    @GetMapping("/coordonnees/{id}")
    public Optional<Coordonnees> getCoordonnee(Long id) {
        return coordonneesService.getCoordonnee(id);
    }

    @DeleteMapping("/coordonnees/{id}")
    public void deleteCoordonnee(final Long id) {
        coordonneesService.deleteCoordonnee(id);
    }

    @PutMapping("/coordonnees")
    public Coordonnees saveCoordonnee(Coordonnees coordonnees)  {
        return coordonneesService.saveCoordonnee(coordonnees);
    }
}
