package com.negosud.api.service;

import com.negosud.api.model.Utilisateurs;
import com.negosud.api.repository.UtilisateursRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class UtilisateursService {

    @Autowired
    private UtilisateursRepository utilisateursRepository;

    public Optional<Utilisateurs> getUtilisateur(final Long id) {
        return utilisateursRepository.findById(id);
    }

    public Iterable<Utilisateurs> getUtilisateurs() {
        return utilisateursRepository.findAll();
    }

    public void deleteUtilisateur(final Long id) {
        utilisateursRepository.deleteById(id);
    }

    public Utilisateurs updateUtilisateur(Utilisateurs utilisateurs) {
        Utilisateurs savedUtilisateur = utilisateursRepository.save(utilisateurs);
        return savedUtilisateur;
    }
    public Utilisateurs saveUtilisateur(Utilisateurs utilisateurs) {
        Utilisateurs savedUtilisateur = utilisateursRepository.save(utilisateurs);
        return savedUtilisateur;
    }
}
