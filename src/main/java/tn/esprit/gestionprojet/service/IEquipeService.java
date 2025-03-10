package tn.esprit.gestionprojet.service;

import tn.esprit.gestionprojet.entities.Equipe;

import java.util.List;

public interface IEquipeService {

    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe equipe);
    void deleteEquipe(long id);
    List<Equipe> getAllEquipes();
    Equipe getEquipeById(long id);
}
