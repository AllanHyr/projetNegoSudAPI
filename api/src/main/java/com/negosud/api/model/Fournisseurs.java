package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fournisseurs")
public class Fournisseurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public Long getFkCoordonnee() {
        return fkCoordonnee;
    }

    String nom;

    String description;

    @Column(name="fk_coordonnee")
    Long fkCoordonnee;
}
