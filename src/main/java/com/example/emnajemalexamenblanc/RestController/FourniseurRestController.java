package com.example.emnajemalexamenblanc.RestController;

import com.example.emnajemalexamenblanc.DAO.Entity.Aeroport;
import com.example.emnajemalexamenblanc.DAO.Entity.Vol;
import com.example.emnajemalexamenblanc.DAO.Entity.Voyageur;
import com.example.emnajemalexamenblanc.DAO.Repositories.FourniseurRepository;
import com.example.emnajemalexamenblanc.Service.FourniseurService;
import com.example.emnajemalexamenblanc.Service.IFourniseurService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("api")



public class FourniseurRestController {
IFourniseurService iFourniseurService;
    private final FourniseurService fourniseurService;

    @PostMapping("/ajouter")
    public String ajouterVolEtAeroport(@RequestBody Vol vol) {
        return fourniseurService.ajouterVolEtAeroport(vol);
    }

    @PostMapping("/ajouterVoya")
    List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs){
        return fourniseurService.ajouterVoyageurs(voyageurs);
    }
}
