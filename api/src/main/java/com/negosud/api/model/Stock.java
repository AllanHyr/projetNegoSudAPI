package com.negosud.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    @Column(name="quantite_stock")
    int quantiteStock;

}
