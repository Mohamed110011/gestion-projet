package tn.esprit.gestionprojet.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionprojet.entities.Equipe;
import tn.esprit.gestionprojet.entities.Projet;
import tn.esprit.gestionprojet.service.IEquipeService;

import java.util.List;

@RestController
@RequestMapping
public class EquipeController {
    @Autowired
    IEquipeService equipeService;
    @PostMapping("/addEquipe")
    Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addEquipe(equipe);
    }

    @PutMapping("/updateEquipe")
    Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }

    @DeleteMapping("/deleteEquipe/{idEquipe}")
    void deleteEquipe(@PathVariable long idEquipe) {
        equipeService.deleteEquipe(idEquipe);
    }
    @PutMapping("/affectterProjetToEquipe/{idEquipe}/{idProjet}")
    Equipe affectterProjetToEquipe(@PathVariable long idEquipe,@PathVariable long idProjet){

        return equipeService.affectterProjetToEquipe(idProjet, idEquipe);
    }
    @PutMapping("/affectterPlusProjetToEquipe/{idEquipe}/{idProjet}")
    Equipe affectterPlusProjetToEquipe(@PathVariable long idEquipe,@PathVariable List<Long> idProjet){

        return equipeService.affectterplusProjetToEquipe(idEquipe,idProjet);
    }
}
