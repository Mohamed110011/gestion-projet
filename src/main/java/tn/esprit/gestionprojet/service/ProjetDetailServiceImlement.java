package tn.esprit.gestionprojet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojet.entities.ProjetDetail;
import tn.esprit.gestionprojet.repository.ProjetDetailRepository;

import java.util.List;

@Service
public class ProjetDetailServiceImlement implements IProjetDetailService{

    @Autowired
    private ProjetDetailRepository repository;

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail) {
        return repository.save(projetDetail);
    }

    @Override
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail) {
        return repository.save(projetDetail);
    }

    @Override
    public void deleteProjetDetail(long id) {
        repository.deleteById(id);

    }

    @Override
    public List<ProjetDetail> getAllProjetDetail() {
        return repository.findAll();
    }

    @Override
    public ProjetDetail getProjetDetailById(long id) {
        return repository.findById(id).get();
    }
}
