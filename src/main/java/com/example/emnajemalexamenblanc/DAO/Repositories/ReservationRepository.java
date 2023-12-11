package com.example.emnajemalexamenblanc.DAO.Repositories;

import com.example.emnajemalexamenblanc.DAO.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
