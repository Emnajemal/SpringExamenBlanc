package com.example.emnajemalexamenblanc.DAO.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="fourniseur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fourniseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFourniseur;

    @Column(name="nomF")
    private String nomF;

    @Column(name="prenomF")
    private String prenomF;

    @Column(name="cin")
    private long cin;
}
