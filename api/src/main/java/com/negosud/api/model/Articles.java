package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "articles")
@Entity
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;

    private String nom;

    private float prix;

    private String description;

    private float marge;

    private int conditionnement;

    private boolean reapprovisionnement;

    @Column(name="quantite_reappro")
    private int quantiteReappro;

    @Column(name="seuil_mini")
    private int seuilMini;

    @Column(name="fk_fournisseur")
    private Long fkFournisseur;

    @Column(name="fk_stock")
    private Long fkStockage;

    @Column(name="fk_famille")
    private Long fkFamille;

}
