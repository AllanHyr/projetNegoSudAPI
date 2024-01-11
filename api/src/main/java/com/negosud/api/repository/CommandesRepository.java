package com.negosud.api.repository;

import com.negosud.api.model.Commandes;
import org.springframework.data.repository.CrudRepository;

public interface CommandesRepository extends CrudRepository<Commandes, Long> {
}
