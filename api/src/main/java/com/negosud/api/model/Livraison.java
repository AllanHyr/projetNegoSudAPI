package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "livraison")
public class Livraison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date_livraison")
    private Date dateLivraison;

    @Column(name="adresse_livraison")
    private String adresseLivraison;

    @Column(name="fk_coordonnee")
    private Long fkCoordonnee;

    @Column(name="fk_facturation")
    private Long fkFacturation;

}
