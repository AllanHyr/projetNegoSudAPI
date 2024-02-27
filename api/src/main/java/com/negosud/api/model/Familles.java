package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "familles")
public class Familles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nom;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    String description;

}
