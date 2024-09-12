package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Proveedores;

public interface ProveedoresDao {
	
	Proveedores crear(Proveedores p);
	Proveedores update(Proveedores p);
	void delete(Long id);
	Optional<Proveedores> read(Long id);
	List<Proveedores> readAll();

}
