package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Tipo_ordenDao;
import com.example.demo.entity.Tipo_orden;
import com.example.demo.service.Tipo_ordenService;

@Service
public class Tipo_ordenServiceImpl implements Tipo_ordenService{

	@Autowired
	private Tipo_ordenDao tipo_ordenDao;
	@Override
	public Tipo_orden crear(Tipo_orden t) {
		// TODO Auto-generated method stub
		return tipo_ordenDao.crear(t);
	}

	@Override
	public Tipo_orden update(Tipo_orden t) {
		// TODO Auto-generated method stub
		return tipo_ordenDao.update(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipo_ordenDao.delete(id);
	}

	@Override
	public Optional<Tipo_orden> read(Long id) {
		// TODO Auto-generated method stub
		return tipo_ordenDao.read(id);
	}

	@Override
	public List<Tipo_orden> readAll() {
		// TODO Auto-generated method stub
		return tipo_ordenDao.readAll();
	}

	
	
}
