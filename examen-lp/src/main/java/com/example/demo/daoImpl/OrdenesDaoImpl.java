package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.OrdenesDao;
import com.example.demo.entity.Ordenes;
import com.example.demo.repository.OrdenesRepository;

@Component
public class OrdenesDaoImpl implements OrdenesDao{

	@Autowired
	private  OrdenesRepository ordenesRepository;
	
	@Override
	public Ordenes crear(Ordenes o) {
		// TODO Auto-generated method stub
		return ordenesRepository.save(o);
	}

	@Override
	public Ordenes update(Ordenes o) {
		// TODO Auto-generated method stub
		return ordenesRepository.save(o);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ordenesRepository.deleteById(id);
	}

	@Override
	public Optional<Ordenes> read(Long id) {
		// TODO Auto-generated method stub
		return ordenesRepository.findById(id);
	}

	@Override
	public List<Ordenes> readAll() {
		// TODO Auto-generated method stub
		return ordenesRepository.findAll();
	}

}
