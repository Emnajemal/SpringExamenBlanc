package com.example.emnajemalexamenblanc.DAO.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="Aeroport")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idA;

    @Column(name="nomA")
    private String nomA;

    @Column(name="codeAITA")
    private String codeAITA;

    @Column(name="tel")
    private long tel;

    @OneToMany(mappedBy = "aeroportt")
    @JsonIgnore
    private Set<Vol> vol ;

    @OneToMany(mappedBy = "aeroport")
    @JsonIgnore
    private Set<Vol> vols ;
}
