package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrdenesDao;
import com.example.demo.entity.Ordenes;
import com.example.demo.service.OrdenesService;

@Service
public class OrdenesServiceImpl implements OrdenesService{

	@Autowired
	private OrdenesDao ordenesDao;
	@Override
	public Ordenes crear(Ordenes o) {
		// TODO Auto-generated method stub
		return ordenesDao.crear(o);
	}

	@Override
	public Ordenes update(Ordenes o) {
		// TODO Auto-generated method stub
		return ordenesDao.update(o);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ordenesDao.delete(id);
	}

	@Override
	public Optional<Ordenes> read(Long id) {
		// TODO Auto-generated method stub
		return ordenesDao.read(id);
	}

	@Override
	public List<Ordenes> readAll() {
		// TODO Auto-generated method stub
		return ordenesDao.readAll();
	}

	
	
}
