package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Forma_pago;

public interface Forma_pagoDao {
	
	Forma_pago crear(Forma_pago f);
	Forma_pago update(Forma_pago f);
	void delete(Long id);
	Optional<Forma_pago> read(Long id);
	List<Forma_pago> readAll();

}
