package com.negosud.api.repository;

import com.negosud.api.model.Articles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends CrudRepository<Articles, Long> {
}
