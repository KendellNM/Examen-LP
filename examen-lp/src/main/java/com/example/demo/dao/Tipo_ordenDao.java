package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Tipo_orden;

public interface Tipo_ordenDao {
	
	Tipo_orden crear(Tipo_orden t);
	Tipo_orden update(Tipo_orden t);
	void delete(Long id);
	Optional<Tipo_orden> read(Long id);
	List<Tipo_orden> readAll();

}
