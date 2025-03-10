package tn.esprit.gestionprojet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.Equipe;
import tn.esprit.gestionprojet.repository.EquipeRepository;

import java.util.List;

@Service

public class EquipeServiceImplement implements IEquipeService{

    @Autowired
    private EquipeRepository equipeRepository;

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
}
