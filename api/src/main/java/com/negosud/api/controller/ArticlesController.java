package com.negosud.api.controller;

import com.negosud.api.model.Articles;
import com.negosud.api.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping("/articles")
    public Iterable<Articles> getArticles() {
        return articlesService.getArticles();
    }
}
