package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "utilisateurs")
public class Utilisateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int grade;

    private String identifiant;

    @Column(name="mot_de_passe")
    private String motDePasse;

    private String nom;

    private String prenom;

}
