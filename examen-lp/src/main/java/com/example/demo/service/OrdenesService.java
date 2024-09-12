package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Ordenes;

public interface OrdenesService {
	
	Ordenes crear(Ordenes o);
	Ordenes update(Ordenes o);
	void delete(Long id);
	Optional<Ordenes> read(Long id);
	List<Ordenes> readAll();

}
