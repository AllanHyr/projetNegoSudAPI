package com.negosud.api.service;

import com.negosud.api.model.ArticlesCommandes;
import com.negosud.api.repository.ArticlesCommandesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ArticlesCommandesService {

    @Autowired
    private ArticlesCommandesRepository articlesCommandesRepository;

    public Optional<ArticlesCommandes> getArticleCommande(final Long id) {
        return articlesCommandesRepository.findById(id);
    }

    public Iterable<ArticlesCommandes> getArticlesCommandes() {
        return articlesCommandesRepository.findAll();
    }

    public void deleteArticleCommande(final Long id) {
        articlesCommandesRepository.deleteById(id);
    }

    public ArticlesCommandes saveArticleCommande(ArticlesCommandes articlesCommandes) {
        ArticlesCommandes savedArticlesCommandes = articlesCommandesRepository.save(articlesCommandes);
        return savedArticlesCommandes;
    }

}
