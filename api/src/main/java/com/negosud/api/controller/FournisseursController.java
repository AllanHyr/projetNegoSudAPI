package com.negosud.api.controller;

import com.negosud.api.model.Fournisseurs;
import com.negosud.api.service.FournisseursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9000/")
public class FournisseursController {

    @Autowired
    private FournisseursService fournisseursService;

    @GetMapping("/fournisseurs")
    public Iterable<Fournisseurs> getFournisseurs() {
        return fournisseursService.getFournisseurs();
    }

    @GetMapping("/fournisseurs/{id}")
    public Optional<Fournisseurs> getFournisseur(Long id) {
        return fournisseursService.getFournisseur(id);
    }

    @DeleteMapping("/fournisseurs/{id}")
    public void deleteFournisseur(final Long id) {
        fournisseursService.deleteFournisseur(id);
    }

    @PutMapping("/fournisseurs")
    public Fournisseurs saveFournisseur(Fournisseurs fournisseurs)  {
        return fournisseursService.saveFournisseur(fournisseurs);
    }
}
