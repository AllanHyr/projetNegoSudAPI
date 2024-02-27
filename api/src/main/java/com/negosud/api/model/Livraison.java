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
    Long id;

    @Column(name="date_livraison")
    Date dateLivraison;

    public Long getId() {
        return id;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public Long getFkCoordonnee() {
        return fkCoordonnee;
    }

    public Long getFkFacturation() {
        return fkFacturation;
    }

    @Column(name="adresse_livraison")
    String adresseLivraison;

    @Column(name="fk_coordonnee")
    Long fkCoordonnee;

    @Column(name="fk_facturation")
    Long fkFacturation;

}
