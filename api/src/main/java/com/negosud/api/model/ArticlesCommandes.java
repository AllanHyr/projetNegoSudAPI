package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "articles_commandes")
public class ArticlesCommandes {

    @EmbeddedId
    private ArticlesCommandesId id;

    private int quantite;

    @Column(name="prix_applique")
    private float prixApplique;

    @Embeddable
    public static class ArticlesCommandesId implements Serializable {

        @Column(name = "fk_article")
        private Long fkArticle;

        @Column(name = "fk_commande")
        private Long fkCommande;

    }
}
