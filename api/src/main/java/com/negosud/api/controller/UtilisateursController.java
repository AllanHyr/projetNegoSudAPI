package com.negosud.api.controller;

import com.negosud.api.model.Utilisateurs;
import com.negosud.api.service.UtilisateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UtilisateursController {

    @Autowired
    private UtilisateursService utilisateursService;

    @GetMapping("/utilisateurs")
    public Iterable<Utilisateurs> getUtilisateurs() {
        return utilisateursService.getUtilisateurs();
    }

    @GetMapping("/utilisateurs/{id}")
    public Optional<Utilisateurs> getUtilisateur(Long id) {
        return utilisateursService.getUtilisateur(id);
    }

    @DeleteMapping("/utilisateurs/{id}")
    public void deleteUtilisateur(final Long id) {
        utilisateursService.deleteUtilisateur(id);
    }

    @PutMapping("/utilisateurs")
    public Utilisateurs saveutilisateur(Utilisateurs utilisateurs)  {
        return utilisateursService.saveUtilisateur(utilisateurs);
    }
}
