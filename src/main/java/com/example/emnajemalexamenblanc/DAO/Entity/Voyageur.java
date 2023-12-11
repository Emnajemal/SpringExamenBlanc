package com.example.emnajemalexamenblanc.DAO.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="voyageur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVoyageur;

    @Column(name="nomV")
    private String nomV;

    @Column(name="prenomV")
    private String prenomV;

    LocalDate dateNaissance;

    @OneToMany(mappedBy ="voyageur")
    private Set<Reservation> reservations;



}
