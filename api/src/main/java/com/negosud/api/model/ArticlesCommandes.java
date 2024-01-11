package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "articles_commandes")
public class ArticlesCommandes {

    @Id
    @Column(name="fk_article")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fkArticle;

    @Id
    @Column(name="fk_commande")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fkCommande;

    private int quantite;

    @Column(name="prix_applique")
    private float prixApplique;

}
