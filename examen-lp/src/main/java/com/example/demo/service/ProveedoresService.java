package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Proveedores;

public interface ProveedoresService {
	
	Proveedores crear(Proveedores p);
	Proveedores update(Proveedores p);
	void delete(Long id);
	Optional<Proveedores> read(Long id);
	List<Proveedores> readAll();

}
