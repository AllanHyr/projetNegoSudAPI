package com.negosud.api.controller;

import com.negosud.api.model.Commandes;
import com.negosud.api.service.CommandesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9000/")
public class CommandesController {

    @Autowired
    private CommandesService commandesService;

    @GetMapping("/commandes")
    public Iterable<Commandes> getCommande() {
        return commandesService.getCommandes();
    }

    @GetMapping("/commandes/{id}")
    public Optional<Commandes> getCommande(@PathVariable Long id) {
        return commandesService.getCommande(id);
    }

    @DeleteMapping("/commandes/{id}")
    public void deleteCommande(@PathVariable final Long id) {
        commandesService.deleteCommande(id);
    }

    @PutMapping("/commandes")
    public Commandes updateCommande(@RequestBody Commandes commandes)  {
        return commandesService.updateCommande(commandes);
    }

    @PostMapping("/commandes")
    public Commandes saveCommande(@RequestBody Commandes commandes)  {
        return commandesService.saveCommande(commandes);
    }
}
