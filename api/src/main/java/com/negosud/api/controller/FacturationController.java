package com.negosud.api.controller;

import com.negosud.api.model.Facturation;
import com.negosud.api.service.FacturationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9000/")
public class FacturationController {

    @Autowired
    private FacturationService facturationService;

    @GetMapping("/facturation")
    public Iterable<Facturation> getFacturations() {
        return facturationService.getFacturations();
    }

    @GetMapping("/facturation/{id}")
    public Optional<Facturation> getFacturation(@PathVariable Long id) {
        return facturationService.getFacturation(id);
    }

    @DeleteMapping("/facturation/{id}")
    public void deleteSFacturation(@PathVariable final Long id) {
        facturationService.deleteFacturation(id);
    }

    @PutMapping("/facturation")
    public Facturation updateFacturation(@RequestBody Facturation facturation)  {
        return facturationService.updateFacturation(facturation);
    }
    @PostMapping("/facturation")
    public Facturation saveFacturation(@RequestBody Facturation facturation)  {
        return facturationService.saveFacturation(facturation);
    }
}
