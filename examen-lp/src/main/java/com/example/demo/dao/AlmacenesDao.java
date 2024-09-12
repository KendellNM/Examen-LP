package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Almacenes;

public interface AlmacenesDao {
	
	Almacenes crear(Almacenes a);
	Almacenes update(Almacenes a);
	void delete(Long id);
	Optional<Almacenes> read(Long id);
	List<Almacenes> readAll();

}
