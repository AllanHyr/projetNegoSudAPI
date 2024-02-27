package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "coordonnees")
public class Coordonnees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String adresse;

    String mail;

    String telephone;

    @Column(name="fk_utilisateur")
    Long fkUtilisateur;
}
