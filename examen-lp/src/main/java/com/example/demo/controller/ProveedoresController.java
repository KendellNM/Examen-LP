package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Proveedores;
import com.example.demo.serviceImpl.ProveedoresServiceImpl;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/proveedores")
public class ProveedoresController {
	
	@Autowired
	private ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Proveedores>> readAll() {
		try {
			List<Proveedores> p = proveedoresServiceImpl.readAll();
			
			if(p.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(p, HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Proveedores> crearProveedores(@Valid @RequestBody Proveedores cat) {
		//TODO: process POST request
		try {
			Proveedores proveedores = proveedoresServiceImpl.crear(cat);
			return new ResponseEntity<>(proveedores, HttpStatus.ACCEPTED);
		
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProveedores(@PathVariable("id") Long id, @Valid @RequestBody Proveedores cat) {
		//TODO: process PUT request
		Optional<Proveedores> proveedores = proveedoresServiceImpl.read(id);
		if (proveedores.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(proveedoresServiceImpl.update(cat), HttpStatus.OK);
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Proveedores> readProveedores(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			Proveedores p = proveedoresServiceImpl.read(id).get();
			return new ResponseEntity<>(p, HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Proveedores> delProveedores(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			proveedoresServiceImpl.delete(id);
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
