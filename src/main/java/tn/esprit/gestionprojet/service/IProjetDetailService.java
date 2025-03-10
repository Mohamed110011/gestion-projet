package tn.esprit.gestionprojet.service;

import tn.esprit.gestionprojet.entities.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {


    ProjetDetail addProjetDetail(ProjetDetail projetDetail);
    ProjetDetail updateProjetDetail(ProjetDetail projetDetail);
    void deleteProjetDetail(long id);
    List<ProjetDetail> getAllProjetDetail();
    ProjetDetail getProjetDetailById(long id);
}
