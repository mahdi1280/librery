package com.example.library.repository;

import com.example.library.model.entity.Reserv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservRepo extends JpaRepository<Reserv, Integer> {
}
