package com.negosud.api.service;

import com.negosud.api.model.Livraison;
import com.negosud.api.repository.LivraisonRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class LivraisonService {

    @Autowired
    private LivraisonRepository livraisonRepository;

    public Optional<Livraison> getLivraison(final Long id) {
        return livraisonRepository.findById(id);
    }

    public Iterable<Livraison> getLivraisons() {
        return livraisonRepository.findAll();
    }

    public void deleteLivraison(final Long id) {
        livraisonRepository.deleteById(id);
    }

    public Livraison updateLivraison(Livraison livraison) {
        Livraison savedLivraison = livraisonRepository.save(livraison);
        return savedLivraison;
    }
    public Livraison saveLivraison(Livraison livraison) {
        Livraison savedLivraison = livraisonRepository.save(livraison);
        return savedLivraison;
    }
}
