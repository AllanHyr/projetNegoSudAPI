package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "utilisateurs")
public class Utilisateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int grade;

    String identifiant;

    public Long getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getToken() {
        return token;
    }

    @Column(name="mot_de_passe")
    String motDePasse;

    String nom;

    String prenom;

    String token;

}
