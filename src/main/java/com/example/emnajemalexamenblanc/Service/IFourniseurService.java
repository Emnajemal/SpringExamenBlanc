package com.example.emnajemalexamenblanc.Service;

import com.example.emnajemalexamenblanc.DAO.Entity.Aeroport;
import com.example.emnajemalexamenblanc.DAO.Entity.Vol;
import com.example.emnajemalexamenblanc.DAO.Entity.Voyageur;

import java.util.List;

public interface IFourniseurService {

    String ajouterVolEtAeroport(Vol vol);

    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);
}
