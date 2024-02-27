package com.negosud.api.repository;

import com.negosud.api.controller.CoordonneesController;
import com.negosud.api.controller.UtilisateursController;
import com.negosud.api.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ListClientsRepository {

    @Autowired
    private UtilisateursController utilisateursController;

    @Autowired
    private CoordonneesController coordonneesController;
    public List<ListClients> getAll() {
        List<ListClients> listClients = new ArrayList<ListClients>();
        Iterable<Coordonnees> coordonnees = coordonneesController.getCoordonnees();
        for (Coordonnees coordonnee : coordonnees) {
            ListClients resp = new ListClients();
            Optional<Utilisateurs> respUtilisateur = utilisateursController.getUtilisateur(coordonnee.getFkUtilisateur());
            resp.setIdUtilisateur(respUtilisateur.get().getId());
            resp.setMail(coordonnee.getMail());
            resp.setAdresse(coordonnee.getAdresse());
            resp.setTelephone(coordonnee.getTelephone());
            resp.setNom(respUtilisateur.get().getNom());
            resp.setPrenom(respUtilisateur.get().getPrenom());
            listClients.add(resp);
        }
        return listClients;
    }
}
