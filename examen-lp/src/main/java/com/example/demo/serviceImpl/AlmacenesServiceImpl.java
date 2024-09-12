package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlmacenesDao;
import com.example.demo.entity.Almacenes;
import com.example.demo.service.AlmacenesService;

@Service
public class AlmacenesServiceImpl implements AlmacenesService{

	@Autowired
	private AlmacenesDao almacenesDao;
	@Override
	public Almacenes crear(Almacenes a) {
		// TODO Auto-generated method stub
		return almacenesDao.crear(a);
	}

	@Override
	public Almacenes update(Almacenes a) {
		// TODO Auto-generated method stub
		return almacenesDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenesDao.delete(id);
	}

	@Override
	public Optional<Almacenes> read(Long id) {
		// TODO Auto-generated method stub
		return almacenesDao.read(id);
	}

	@Override
	public List<Almacenes> readAll() {
		// TODO Auto-generated method stub
		return almacenesDao.readAll();
	}

	
	
}
