package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Forma_pagoDao;
import com.example.demo.entity.Forma_pago;
import com.example.demo.service.Forma_pagoService;

@Service
public class Forma_pagoServiceImpl implements Forma_pagoService{

	@Autowired
	private Forma_pagoDao forma_pagoDao;
	@Override
	public Forma_pago crear(Forma_pago f) {
		// TODO Auto-generated method stub
		return forma_pagoDao.crear(f);
	}

	@Override
	public Forma_pago update(Forma_pago f) {
		// TODO Auto-generated method stub
		return forma_pagoDao.update(f);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		forma_pagoDao.delete(id);
	}

	@Override
	public Optional<Forma_pago> read(Long id) {
		// TODO Auto-generated method stub
		return forma_pagoDao.read(id);
	}

	@Override
	public List<Forma_pago> readAll() {
		// TODO Auto-generated method stub
		return forma_pagoDao.readAll();
	}

	
	
}
