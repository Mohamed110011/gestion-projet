package tn.esprit.gestionprojet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.Projet;
import tn.esprit.gestionprojet.repository.ProjetRepository;

import java.util.List;
@Service

public class ProjetServiceImplement implements IProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public Projet addProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void deleteProjet(long id) {
projetRepository.deleteById(id);
    }

    @Override
    public List<Projet> getAllProjet() {
        return projetRepository.findAll();
    }

    @Override
    public Projet getProjetById(long id) {
        return projetRepository.findById(id).get();
    }
}
