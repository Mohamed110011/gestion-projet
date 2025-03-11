package tn.esprit.gestionprojet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.Equipe;
import tn.esprit.gestionprojet.entities.Projet;
import tn.esprit.gestionprojet.repository.EquipeRepository;
import tn.esprit.gestionprojet.repository.ProjetRepository;

import java.util.List;

@Service

public class EquipeServiceImplement implements IEquipeService{

    @Autowired
    private EquipeRepository equipeRepository;
    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe) ;
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void deleteEquipe(long id) {
        equipeRepository.deleteById(id);

    }

    @Override
    public List<Equipe> getAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe getEquipeById(long id) {
        return  equipeRepository.findById(id).get();
    }

    @Override
    public Equipe affectterProjetToEquipe(long idEquipe, long idProjet) {
        Equipe equipe = equipeRepository.findById(idEquipe).get();
        Projet projet = projetRepository.findById(idProjet).get();
        equipe.getProjets().add(projet);
        return equipeRepository.save(equipe) ;

    }

    @Override
    public Equipe affectterplusProjetToEquipe(long idEquipe, List<Long> idProjet) {
        Equipe equipe = equipeRepository.findById(idEquipe).get();
         List<Projet> projets= projetRepository.findAllById(idProjet);
        equipe.getProjets().addAll(projets);
        return equipeRepository.save(equipe) ;
    }
}
