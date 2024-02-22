package com.negosud.api.service;

import com.negosud.api.model.Commandes;
import com.negosud.api.repository.CommandesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class CommandesService {

    @Autowired
    private CommandesRepository commandesRepository;

    public Optional<Commandes> getCommande(final Long id) {
        return commandesRepository.findById(id);
    }

    public Iterable<Commandes> getCommandes() {
        return commandesRepository.findAll();
    }

    public void deleteCommande(final Long id) {
        commandesRepository.deleteById(id);
    }

    public Commandes updateCommande(Commandes commandes) {
        Commandes savedCommandes = commandesRepository.save(commandes);
        return savedCommandes;
    }
    public Commandes saveCommande(Commandes commandes) {
        Commandes savedCommandes = commandesRepository.save(commandes);
        return savedCommandes;
    }
}
