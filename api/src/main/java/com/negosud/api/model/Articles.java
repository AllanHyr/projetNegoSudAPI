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

    private String nom;

    private String reference;

    @Column(name="quantite_reappro")
    private int quantiteReappro;

    @Column(name="fk_stock")
    private Long fkStockage;

    @Column(name="fk_famille")
    private Long fkFamille;


}
