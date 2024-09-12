package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tipo_orden;
import com.example.demo.serviceImpl.Tipo_ordenServiceImpl;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/tipo_orden")
public class Tipo_ordenController {
	
	@Autowired
	private Tipo_ordenServiceImpl tipo_ordenServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Tipo_orden>> readAll() {
		try {
			List<Tipo_orden>t = tipo_ordenServiceImpl.readAll();
			
			if(t.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(t, HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Tipo_orden> crearTipo_orden(@Valid @RequestBody Tipo_orden cat) {
		//TODO: process POST request
		try {
			Tipo_orden tipo_orden = tipo_ordenServiceImpl.crear(cat);
			return new ResponseEntity<>(tipo_orden, HttpStatus.ACCEPTED);
		
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTipo_orden(@PathVariable("id") Long id, @Valid @RequestBody Tipo_orden cat) {
		//TODO: process PUT request
		Optional<Tipo_orden> tipo_orden = tipo_ordenServiceImpl.read(id);
		if (tipo_orden.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(tipo_ordenServiceImpl.update(cat), HttpStatus.OK);
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Tipo_orden> readTipo_orden(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			Tipo_orden t = tipo_ordenServiceImpl.read(id).get();
			return new ResponseEntity<>(t, HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipo_orden> delTipo_orden(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			tipo_ordenServiceImpl.delete(id);
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
