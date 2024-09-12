package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProveedoresDao;
import com.example.demo.entity.Proveedores;
import com.example.demo.service.ProveedoresService;

@Service
public class ProveedoresServiceImpl implements ProveedoresService{

	@Autowired
	private ProveedoresDao proveedoresesDao;
	@Override
	public Proveedores crear(Proveedores p) {
		// TODO Auto-generated method stub
		return proveedoresesDao.crear(p);
	}

	@Override
	public Proveedores update(Proveedores p) {
		// TODO Auto-generated method stub
		return proveedoresesDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedoresesDao.delete(id);
	}

	@Override
	public Optional<Proveedores> read(Long id) {
		// TODO Auto-generated method stub
		return proveedoresesDao.read(id);
	}

	@Override
	public List<Proveedores> readAll() {
		// TODO Auto-generated method stub
		return proveedoresesDao.readAll();
	}

	
	
}
