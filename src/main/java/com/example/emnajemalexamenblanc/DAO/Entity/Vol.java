package com.example.emnajemalexamenblanc.DAO.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="vol")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVol;

    LocalDate dateDepart;
    LocalDate dateArive;

    @OneToMany(mappedBy = "vol")
    private Set <Reservation> reservations;

    @ManyToOne(cascade = CascadeType.ALL)
    Aeroport aeroport;
    @ManyToOne(cascade = CascadeType.ALL)
    Aeroport aeroportt;
}
