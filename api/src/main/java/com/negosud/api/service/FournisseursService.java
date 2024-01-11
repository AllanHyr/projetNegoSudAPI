package com.negosud.api.service;

import com.negosud.api.model.Fournisseurs;
import com.negosud.api.repository.FournisseursRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class FournisseursService {

    @Autowired
    private FournisseursRepository fournisseursRepository;

    public Optional<Fournisseurs> getFournisseur(final Long id) {
        return fournisseursRepository.findById(id);
    }

    public Iterable<Fournisseurs> getFournisseurs() {
        return fournisseursRepository.findAll();
    }

    public void deleteFournisseur(final Long id) {
        fournisseursRepository.deleteById(id);
    }

    public Fournisseurs saveFournisseur(Fournisseurs fournisseurs) {
        Fournisseurs savedFournisseurs = fournisseursRepository.save(fournisseurs);
        return savedFournisseurs;
    }
}
