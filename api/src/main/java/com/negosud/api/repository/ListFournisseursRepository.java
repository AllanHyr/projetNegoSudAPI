package com.negosud.api.repository;

import com.negosud.api.controller.CoordonneesController;
import com.negosud.api.controller.FournisseursController;
import com.negosud.api.model.Coordonnees;
import com.negosud.api.model.Fournisseurs;
import com.negosud.api.model.ListFournisseurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ListFournisseursRepository {

    @Autowired
    private FournisseursController fournisseursController;

    @Autowired
    private CoordonneesController coordonneesController;

    public List<ListFournisseurs> findAll() {
        List<ListFournisseurs> listFournisseurs = new ArrayList<ListFournisseurs>();
        Iterable<Fournisseurs> fournisseurs = fournisseursController.getFournisseurs();
        for (Fournisseurs fournisseur : fournisseurs) {
            ListFournisseurs resp = new ListFournisseurs();
            Optional<Coordonnees> respCoordonne = coordonneesController.getCoordonnee(fournisseur.getFkCoordonnee());
            resp.setIdFournisseur(fournisseur.getId());
            resp.setNomFournisseur(fournisseur.getNom());
            resp.setAdresse(respCoordonne.get().getAdresse());
            resp.setMail(respCoordonne.get().getMail());
            resp.setTelephone(respCoordonne.get().getTelephone());
            listFournisseurs.add(resp);
        }
        return listFournisseurs;
    }
}
