package com.negosud.api.repository;

import com.negosud.api.controller.ArticlesController;
import com.negosud.api.controller.FamillesController;
import com.negosud.api.controller.FournisseursController;
import com.negosud.api.controller.StockController;
import com.negosud.api.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class GestionStocksRepository {

    @Autowired
    private ArticlesController articlesController;

    @Autowired
    private StockController stockController;

    @Autowired
    private FamillesController famillesController;

    @Autowired
    private FournisseursController fournisseursController;

    public List<GestionStocks> findAll() {
        List<GestionStocks> listGestionStocks = new ArrayList<GestionStocks>();
        Iterable<Articles> articles = articlesController.getArticles();
        for (Articles article : articles) {
            GestionStocks resp = new GestionStocks();
            Optional<Stock> respStock = stockController.getStock(article.getFkStockage());
            Optional<Familles> respFamilles = famillesController.getFamille(article.getFkFamille());
            Optional<Fournisseurs> respFournisseurs = fournisseursController.getFournisseur(article.getFkFournisseur());
            resp.setIdArticle(article.getId());
            resp.setNomArticle(article.getNom());
            resp.setReference(article.getReference());
            resp.setAnnee(article.getAnnee());
            resp.setSeuilMini(article.getSeuilMini());
            resp.setQuantitéStock(respStock.get().getQuantiteStock());
            resp.setNomFamille(respFamilles.get().getNom());
            resp.setNomFournisseur(respFournisseurs.get().getNom());
            listGestionStocks.add(resp);
        }
        return listGestionStocks;
    }
}
