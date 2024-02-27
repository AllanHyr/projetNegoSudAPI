package com.negosud.api.model;

public class GestionStocks {

    Long idArticle;
    String nomArticle;

    String reference;

    int annee;

    int seuilMini;

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setSeuilMini(int seuilMini) {
        this.seuilMini = seuilMini;
    }

    public int getSeuilMini() {
        return seuilMini;
    }

    int quantitéStock;

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setQuantitéStock(int quantitéStock) {
        this.quantitéStock = quantitéStock;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public Long getIdArticle() {
        return idArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public String getReference() {
        return reference;
    }

    public int getQuantitéStock() {
        return quantitéStock;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    String nomFamille;

    String nomFournisseur;
}
