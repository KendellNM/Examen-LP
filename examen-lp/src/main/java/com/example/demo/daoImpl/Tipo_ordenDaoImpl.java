package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Tipo_ordenDao;
import com.example.demo.entity.Tipo_orden;
import com.example.demo.repository.Tipo_ordenRepository;

@Component
public class Tipo_ordenDaoImpl implements Tipo_ordenDao{

	@Autowired
	private  Tipo_ordenRepository tipo_ordenRepository;
	
	@Override
	public Tipo_orden crear(Tipo_orden t) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.save(t);
	}

	@Override
	public Tipo_orden update(Tipo_orden t) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipo_ordenRepository.deleteById(id);
	}

	@Override
	public Optional<Tipo_orden> read(Long id) {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.findById(id);
	}

	@Override
	public List<Tipo_orden> readAll() {
		// TODO Auto-generated method stub
		return tipo_ordenRepository.findAll();
	}

}
