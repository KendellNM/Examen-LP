package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Ordenes;
import com.example.demo.serviceImpl.OrdenesServiceImpl;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/ordenes")
public class OrdenesController {
	
	@Autowired
	private OrdenesServiceImpl ordenesServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Ordenes>> readAll() {
		try {
			List<Ordenes> o = ordenesServiceImpl.readAll();
			
			if(o.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(o, HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Ordenes> crearOrdenes(@Valid @RequestBody Ordenes cat) {
		//TODO: process POST request
		try {
			Ordenes ordenes = ordenesServiceImpl.crear(cat);
			return new ResponseEntity<>(ordenes, HttpStatus.ACCEPTED);
		
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateOrdenes(@PathVariable("id") Long id, @Valid @RequestBody Ordenes cat) {
		//TODO: process PUT request
		Optional<Ordenes> ordenes = ordenesServiceImpl.read(id);
		if (ordenes.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(ordenesServiceImpl.update(cat), HttpStatus.OK);
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Ordenes> readOrdenes(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			Ordenes o = ordenesServiceImpl.read(id).get();
			return new ResponseEntity<>(o, HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Ordenes> delOrdenes(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			ordenesServiceImpl.delete(id);
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
