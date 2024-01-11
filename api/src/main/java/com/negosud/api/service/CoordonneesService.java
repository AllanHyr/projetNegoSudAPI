package com.negosud.api.service;

import com.negosud.api.model.Coordonnees;
import com.negosud.api.repository.CoordonneesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class CoordonneesService {

    @Autowired
    private CoordonneesRepository coordonneesRepository;

    public Optional<Coordonnees> getCoordonnee(final Long id) {
        return coordonneesRepository.findById(id);
    }

    public Iterable<Coordonnees> getCoordonnees() {
        return coordonneesRepository.findAll();
    }

    public void deleteCoordonnee(final Long id) {
        coordonneesRepository.deleteById(id);
    }

    public Coordonnees saveCoordonnee(Coordonnees coordonnees) {
        Coordonnees savedCoordonnees = coordonneesRepository.save(coordonnees);
        return savedCoordonnees;
    }
}
