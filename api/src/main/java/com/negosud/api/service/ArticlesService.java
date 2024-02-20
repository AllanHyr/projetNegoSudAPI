package com.negosud.api.service;

import com.negosud.api.model.Articles;
import com.negosud.api.model.NewArticles;
import com.negosud.api.repository.ArticlesRepository;
import com.negosud.api.repository.NewArticlesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ArticlesService {

    @Autowired
    private ArticlesRepository articlesRepository;

    @Autowired
    private NewArticlesRepository newArticlesRepository;

    public Optional<Articles> getArticle(final Long id) {
        return articlesRepository.findById(id);
    }

    public Iterable<Articles> getArticles() {
        return articlesRepository.findAll();
    }

    public void deleteArticle(final Long id) {
        articlesRepository.deleteById(id);
    }

    public Articles updateArticle(Articles articles) {
        Articles savedArticles = articlesRepository.save(articles);
        return savedArticles;
    }

    public NewArticles saveArticle(NewArticles articles) {
        NewArticles savedNewArticles = newArticlesRepository.save(articles);
        return savedNewArticles;
    }

}
