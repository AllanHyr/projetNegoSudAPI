package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "commandes")
public class Commandes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date_commande")
    private Date dateCommande;

    private String commentaire;

    @Column(name="fk_fournisseur")
    private Long fkFournisseur;

    @Column(name="fk_utilisateur")
    private Long fkUtilisateur;

}
