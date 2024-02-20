package com.negosud.api.controller;

import com.negosud.api.model.Livraison;
import com.negosud.api.service.LivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9000/")
public class LivraisonController {

    @Autowired
    private LivraisonService livraisonService;

    @GetMapping("/livraison")
    public Iterable<Livraison> getLivraisons() {
        return livraisonService.getLivraisons();
    }

    @GetMapping("/livraison/{id}")
    public Optional<Livraison> getLivraison(Long id) {
        return livraisonService.getLivraison(id);
    }

    @DeleteMapping("/livraison/{id}")
    public void deleteLivraison(final Long id) {
        livraisonService.deleteLivraison(id);
    }

    @PutMapping("/livraison")
    public Livraison saveStock(Livraison livraison)  {
        return livraisonService.saveLivraison(livraison);
    }
}
