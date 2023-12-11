package com.example.emnajemalexamenblanc.Service;

import com.example.emnajemalexamenblanc.DAO.Entity.Aeroport;
import com.example.emnajemalexamenblanc.DAO.Entity.Vol;
import com.example.emnajemalexamenblanc.DAO.Entity.Voyageur;
import com.example.emnajemalexamenblanc.DAO.Repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FourniseurService implements IFourniseurService{
    FourniseurRepository fourniseurRepository;
    AeroportRepository aeroportRepository;
    ReservationRepository reservationRepository;
    VolRepository volRepository;
    VoyageurRepository voyageurRepository;





    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        Aeroport aeroportDepart = vol.getAeroport();
        Aeroport aeroportArrive = vol.getAeroportt();
        aeroportRepository.save(aeroportDepart);
        aeroportRepository.save(aeroportArrive);
        volRepository.save(vol);
        return "Vol et Aeroports ajoutés avec succès.";
    }


    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return voyageurRepository.saveAll(voyageurs);
    }
}
