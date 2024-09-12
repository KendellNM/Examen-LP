package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Almacenes;

@Repository
public interface AlmacenesRepository extends JpaRepository<Almacenes, Long>{

}
