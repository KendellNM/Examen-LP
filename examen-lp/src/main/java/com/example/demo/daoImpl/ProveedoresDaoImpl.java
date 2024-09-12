package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ProveedoresDao;
import com.example.demo.entity.Proveedores;
import com.example.demo.repository.ProveedoresRepository;

@Component
public class ProveedoresDaoImpl implements ProveedoresDao{

	@Autowired
	private  ProveedoresRepository proveedoresRepository;
	
	@Override
	public Proveedores crear(Proveedores p) {
		// TODO Auto-generated method stub
		return proveedoresRepository.save(p);
	}

	@Override
	public Proveedores update(Proveedores p) {
		// TODO Auto-generated method stub
		return proveedoresRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedoresRepository.deleteById(id);
	}

	@Override
	public Optional<Proveedores> read(Long id) {
		// TODO Auto-generated method stub
		return proveedoresRepository.findById(id);
	}

	@Override
	public List<Proveedores> readAll() {
		// TODO Auto-generated method stub
		return proveedoresRepository.findAll();
	}

}
