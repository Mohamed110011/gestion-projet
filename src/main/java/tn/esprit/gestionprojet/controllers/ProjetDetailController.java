package tn.esprit.gestionprojet.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionprojet.entities.ProjetDetail;
import tn.esprit.gestionprojet.service.IProjetDetailService;

@RestController
@RequestMapping
public class ProjetDetailController {
    @Autowired
    IProjetDetailService projetDetailService;

    @PostMapping("/addProjetDetail")
    ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return projetDetailService.addProjetDetail(projetDetail);
    }





    @PutMapping("/updateProjetDetail")
    ProjetDetail updateProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return projetDetailService.updateProjetDetail(projetDetail);
    }



    @DeleteMapping("/deleteProjetDetail/{idProjetDetail}")
    void deleteProjetDetail(@PathVariable long idProjetDetail) {
        projetDetailService.deleteProjetDetail(idProjetDetail);

    }
}
