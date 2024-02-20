package com.negosud.api.repository;

import com.negosud.api.model.NewStock;
import org.springframework.data.repository.CrudRepository;

public interface NewStockRepository extends CrudRepository<NewStock, Long> {
}
