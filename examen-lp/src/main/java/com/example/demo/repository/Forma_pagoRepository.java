package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Forma_pago;

@Repository
public interface Forma_pagoRepository extends JpaRepository<Forma_pago, Long>{

}
