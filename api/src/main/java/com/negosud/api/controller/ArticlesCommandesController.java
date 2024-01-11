package com.negosud.api.controller;

import com.negosud.api.model.ArticlesCommandes;
import com.negosud.api.service.ArticlesCommandesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ArticlesCommandesController {


    @Autowired
    private ArticlesCommandesService articlesCommandesService;

    @GetMapping("/articles-commandes")
    public Iterable<ArticlesCommandes> getArticlesCommandes() {
        return articlesCommandesService.getArticlesCommandes();
    }

    @GetMapping("/articles-commandes/{id}")
    public Optional<ArticlesCommandes> getArticleCommande(Long id) {
        return articlesCommandesService.getArticleCommande(id);
    }

    @DeleteMapping("/articles-commandes/{id}")
    public void deleteArticleCommande(final Long id) {
        articlesCommandesService.deleteArticleCommande(id);
    }

    @PutMapping("/articles-commandes")
    public ArticlesCommandes saveArticleCommande(ArticlesCommandes articlesCommandes)  {
        return articlesCommandesService.saveArticleCommande(articlesCommandes);
    }
}
