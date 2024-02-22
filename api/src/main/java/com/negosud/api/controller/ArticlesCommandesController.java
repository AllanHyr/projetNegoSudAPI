package com.negosud.api.controller;

import com.negosud.api.model.ArticlesCommandes;
import com.negosud.api.service.ArticlesCommandesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9000/")
public class ArticlesCommandesController {


    @Autowired
    private ArticlesCommandesService articlesCommandesService;

    @GetMapping("/articles-commandes")
    public Iterable<ArticlesCommandes> getArticlesCommandes() {
        return articlesCommandesService.getArticlesCommandes();
    }

    @GetMapping("/articles-commandes/{id}")
    public Optional<ArticlesCommandes> getArticleCommande(@PathVariable Long id) {
        return articlesCommandesService.getArticleCommande(id);
    }

    @DeleteMapping("/articles-commandes/{id}")
    public void deleteArticleCommande(@PathVariable final Long id) {
        articlesCommandesService.deleteArticleCommande(id);
    }

    @PutMapping("/articles-commandes")
    public ArticlesCommandes updateArticleCommande(@RequestBody ArticlesCommandes articlesCommandes)  {
        return articlesCommandesService.updateArticleCommande(articlesCommandes);
    }
    @PostMapping("/articles-commandes")
    public ArticlesCommandes saveArticleCommande(@RequestBody ArticlesCommandes articlesCommandes)  {
        return articlesCommandesService.saveArticleCommande(articlesCommandes);
    }
}
