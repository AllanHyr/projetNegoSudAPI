package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "articles_commandes")
public class ArticlesCommandes {

    @EmbeddedId
    ArticlesCommandesId id;

    public ArticlesCommandesId getId() {
        return id;
    }

    public int getQuantite() {
        return quantite;
    }

    public float getPrixApplique() {
        return prixApplique;
    }

    int quantite;

    @Column(name="prix_applique")
    float prixApplique;

    @Embeddable
    static class ArticlesCommandesId implements Serializable {

        @Column(name = "fk_article")
        Long fkArticle;

        @Column(name = "fk_commande")
        Long fkCommande;

        public Long getFkArticle() {
            return fkArticle;
        }

        public Long getFkCommande() {
            return fkCommande;
        }
    }
}
