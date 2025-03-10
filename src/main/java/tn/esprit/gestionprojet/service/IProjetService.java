package tn.esprit.gestionprojet.service;

import tn.esprit.gestionprojet.entities.Projet;

import java.util.List;

public interface IProjetService {

    Projet addProjet(Projet projet);
    Projet updateProjet(Projet projet);
    void deleteProjet(long id);
    List<Projet> getAllProjet();
    Projet getProjetById(long id);
}
