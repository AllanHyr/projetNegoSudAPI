package com.negosud.api.service;

import com.negosud.api.model.Familles;
import com.negosud.api.repository.FamillesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class FamillesService {

    @Autowired
    private FamillesRepository famillesRepository;

    public Optional<Familles> getFamille(final Long id) {
        return famillesRepository.findById(id);
    }

    public Iterable<Familles> getFamilles() {
        return famillesRepository.findAll();
    }

    public void deleteFamille(final Long id) {
        famillesRepository.deleteById(id);
    }

    public Familles updateFamille(Familles familles) {
        Familles savedFamilles = famillesRepository.save(familles);
        return savedFamilles;
    }
    public Familles saveFamille(Familles familles) {
        Familles savedFamilles = famillesRepository.save(familles);
        return savedFamilles;
    }
}
