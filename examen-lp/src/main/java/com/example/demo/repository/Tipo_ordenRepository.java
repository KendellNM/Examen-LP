package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tipo_orden;

@Repository
public interface Tipo_ordenRepository extends JpaRepository<Tipo_orden, Long>{

}
