package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "articles")
@Entity
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String reference;

    String nom;

    float prix;

    String description;

    float marge;

    int conditionnement;

    int annee;

    boolean reapprovisionnement;

    @Column(name="quantite_reappro")
    int quantiteReappro;

    @Column(name="seuil_mini")
    int seuilMini;

    @Column(name="fk_fournisseur")
    Long fkFournisseur;

    public int getAnnee() {
        return annee;
    }

    public Long getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public float getMarge() {
        return marge;
    }

    public int getConditionnement() {
        return conditionnement;
    }

    public boolean isReapprovisionnement() {
        return reapprovisionnement;
    }

    public int getQuantiteReappro() {
        return quantiteReappro;
    }

    public int getSeuilMini() {
        return seuilMini;
    }

    public Long getFkFournisseur() {
        return fkFournisseur;
    }

    public Long getFkStockage() {
        return fkStockage;
    }

    public Long getFkFamille() {
        return fkFamille;
    }

    @Column(name="fk_stock")
    Long fkStockage;

    @Column(name="fk_famille")
    Long fkFamille;

}
