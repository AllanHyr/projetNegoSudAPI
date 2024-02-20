package com.negosud.api.controller;

import com.negosud.api.model.Articles;
import com.negosud.api.model.NewArticles;
import com.negosud.api.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9000/")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping("/articles")
    public Iterable<Articles> getArticles() {
        return articlesService.getArticles();
    }

    @GetMapping("/article/{id}")
    public Optional<Articles> getArticle(@PathVariable Long id) {
        return articlesService.getArticle(id);
    }

    @DeleteMapping("/article/{id}")
    public void deleteArticle(@PathVariable Long id) {
        articlesService.deleteArticle(id);
    }

    @PutMapping("/article")
    public Articles updateArticle(Articles articles)  {
       return articlesService.updateArticle(articles);
    }

    @PostMapping("/article")
    public NewArticles saveArticle(NewArticles articles)  {
        return articlesService.saveArticle(articles);
    }

}
