package tn.esprit.gestionprojet.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionprojet.entities.Equipe;
import tn.esprit.gestionprojet.service.IEquipeService;

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
}
