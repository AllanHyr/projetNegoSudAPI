package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Facturation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float TVA;

    @Column(name="date_paiement")
    private Date datePaiement;

    @Column(name="moyen_paiement")
    private String moyenPaiement;

    @Column(name="fk_commande")
    private Long fkCommande;
}
