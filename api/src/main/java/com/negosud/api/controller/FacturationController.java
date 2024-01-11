package com.negosud.api.controller;

import com.negosud.api.model.Facturation;
import com.negosud.api.service.FacturationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class FacturationController {

    @Autowired
    private FacturationService facturationService;

    @GetMapping("/facturation")
    public Iterable<Facturation> getFacturations() {
        return facturationService.getFacturations();
    }

    @GetMapping("/facturation/{id}")
    public Optional<Facturation> getFacturation(Long id) {
        return facturationService.getFacturation(id);
    }

    @DeleteMapping("/facturation/{id}")
    public void deleteSFacturation(final Long id) {
        facturationService.deleteFacturation(id);
    }

    @PutMapping("/facturation")
    public Facturation saveFacturation(Facturation facturation)  {
        return facturationService.saveFacturation(facturation);
    }
}
