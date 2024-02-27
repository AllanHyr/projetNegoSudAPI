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
    Long id;

    @Column(name="date_commande")
    Date dateCommande;

    public Long getId() {
        return id;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public Long getFkFournisseur() {
        return fkFournisseur;
    }

    public Long getFkUtilisateur() {
        return fkUtilisateur;
    }

    String commentaire;

    @Column(name="fk_fournisseur")
    Long fkFournisseur;

    @Column(name="fk_utilisateur")
    Long fkUtilisateur;

}
