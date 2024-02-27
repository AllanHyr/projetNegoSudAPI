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
    Long id;

    float TVA;

    public Long getId() {
        return id;
    }

    public float getTVA() {
        return TVA;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public String getMoyenPaiement() {
        return moyenPaiement;
    }

    public Long getFkCommande() {
        return fkCommande;
    }

    @Column(name="date_paiement")
    Date datePaiement;

    @Column(name="moyen_paiement")
    String moyenPaiement;

    @Column(name="fk_commande")
    Long fkCommande;
}
