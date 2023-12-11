package com.example.emnajemalexamenblanc.RestController;

import com.example.emnajemalexamenblanc.Service.IFourniseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AeroportRestController {
    IFourniseurService iFourniseurService;

    @PostMapping("/ajouter")
    public String ajouterVolEtAeroport(@RequestBody Vol vol, @RequestBody Aeroport aeroportDepart, @RequestBody Aeroport aeroportArrive) {
        return examenBlancService.ajouterVolEtAeroport(vol, aeroportDepart, aeroportArrive);
    }
}
