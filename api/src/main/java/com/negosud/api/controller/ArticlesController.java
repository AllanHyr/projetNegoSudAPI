package com.negosud.api.controller;

import com.negosud.api.model.Articles;
import com.negosud.api.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping("/articles")
    public Iterable<Articles> getArticles() {
        return articlesService.getArticles();
    }

    @GetMapping("/articles/{id}")
    public Optional<Articles> getArticle(Long id) {
        return articlesService.getArticle(id);
    }

    @DeleteMapping("/articles/{id}")
    public void deleteArticle(final Long id) {
        articlesService.deleteArticle(id);
    }

    @PutMapping("/articles")
    public Articles saveArticle(Articles articles)  {
       return articlesService.saveArticle(articles);
    }

}
