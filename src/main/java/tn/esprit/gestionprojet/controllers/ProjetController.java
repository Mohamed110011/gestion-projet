package tn.esprit.gestionprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionprojet.entities.Projet;
import tn.esprit.gestionprojet.service.IProjetService;

@RestController
@RequestMapping
public class ProjetController {
    @Autowired
    IProjetService projetService;
    @PostMapping("/addProjet")
    Projet addProjet(@RequestBody Projet projet) {
        return projetService.addProjet(projet);
    }
    @PutMapping("/updateProjet")
    Projet updateProjet(@RequestBody Projet projet) {
        return projetService.updateProjet(projet);
    }



    @DeleteMapping("/deleteProjet/{idProjet}")
void  deleteProjet(@PathVariable long idProjet){
    projetService.deleteProjet(idProjet);


    }
}
