package com.negosud.api.service;

import com.negosud.api.model.Facturation;
import com.negosud.api.repository.FacturationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class FacturationService {

    @Autowired
    private FacturationRepository facturationRepository;

    public Optional<Facturation> getFacturation(final Long id) {
        return facturationRepository.findById(id);
    }

    public Iterable<Facturation> getFacturations() {
        return facturationRepository.findAll();
    }

    public void deleteFacturation(final Long id) {
        facturationRepository.deleteById(id);
    }

    public Facturation saveFacturation(Facturation facturation) {
        Facturation savedFacturation = facturationRepository.save(facturation);
        return savedFacturation;
    }
}
