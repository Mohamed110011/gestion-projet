package tn.esprit.gestionprojet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.Projet;
import tn.esprit.gestionprojet.entities.ProjetDetail;
import tn.esprit.gestionprojet.repository.ProjetDetailRepository;
import tn.esprit.gestionprojet.repository.ProjetRepository;

import java.util.List;
@Service


public class ProjetServiceImplement implements IProjetService {

    @Autowired
    private ProjetRepository projetRepository;
    @Autowired
    private ProjetDetailRepository projetDetailRepository;

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

    @Override
    public Projet affecterProjetDetailToProjet(long idProjet, long idProjetDetail) {
        Projet projet = projetRepository.findById(idProjet).get();
        ProjetDetail detailProjet=projetDetailRepository.findById(idProjetDetail).get();
        projet.setProjetDetail(detailProjet);
        return projetRepository.save(projet);
    }

    @Override
    public Projet ajouterProjetEtAffecterProjetDetail(Projet projet, long idProjetDetail) {
        ProjetDetail projetDetail=projetDetailRepository.findById(idProjetDetail).get();
        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }
}
