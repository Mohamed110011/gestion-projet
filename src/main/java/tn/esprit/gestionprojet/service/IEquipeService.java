package tn.esprit.gestionprojet.service;

import tn.esprit.gestionprojet.entities.Equipe;
import tn.esprit.gestionprojet.entities.Projet;

import java.util.List;

public interface IEquipeService {

    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe equipe);
    void deleteEquipe(long id);
    List<Equipe> getAllEquipes();
    Equipe getEquipeById(long id);
    Equipe affectterProjetToEquipe(long idEquipe , long idProjet);
    Equipe affectterplusProjetToEquipe(long idEquipe , List<Long> idProjet);
}
