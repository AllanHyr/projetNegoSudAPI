package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "coordonnees")
public class Coordonnees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adresse;

    private String mail;

    private String telephone;

    @Column(name="fk_utilisateur")
    private Long fkUtilisateur;
}
