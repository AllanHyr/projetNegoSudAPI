package com.negosud.api.repository;

import com.negosud.api.model.NewArticles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewArticlesRepository extends CrudRepository<NewArticles, Long> {
}
