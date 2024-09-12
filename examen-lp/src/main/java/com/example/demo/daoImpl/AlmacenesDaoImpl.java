package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.AlmacenesDao;
import com.example.demo.entity.Almacenes;
import com.example.demo.repository.AlmacenesRepository;

@Component
public class AlmacenesDaoImpl implements AlmacenesDao{

	@Autowired
	private  AlmacenesRepository almacenesRepository;
	
	@Override
	public Almacenes crear(Almacenes a) {
		// TODO Auto-generated method stub
		return almacenesRepository.save(a);
	}

	@Override
	public Almacenes update(Almacenes a) {
		// TODO Auto-generated method stub
		return almacenesRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenesRepository.deleteById(id);
	}

	@Override
	public Optional<Almacenes> read(Long id) {
		// TODO Auto-generated method stub
		return almacenesRepository.findById(id);
	}

	@Override
	public List<Almacenes> readAll() {
		// TODO Auto-generated method stub
		return almacenesRepository.findAll();
	}

}
