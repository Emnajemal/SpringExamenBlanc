package com.example.emnajemalexamenblanc.DAO.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    @Id
    private String idR;

    LocalDate dateReservation;

    @Enumerated(EnumType.STRING)
    private ClassPlace classPlace;

    @Enumerated(EnumType.STRING)
    private EtatReservation etatReservation;

    @ManyToOne(cascade = CascadeType.ALL)
    Vol vol;

    @ManyToOne(cascade = CascadeType.ALL)
    Voyageur voyageur;
}
