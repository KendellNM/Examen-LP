package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Almacenes;
import com.example.demo.serviceImpl.AlmacenesServiceImpl;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/almacenes")
public class AlmacenesController {
	
	@Autowired
	private AlmacenesServiceImpl almacenesServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Almacenes>> readAll() {
		try {
			List<Almacenes>a = almacenesServiceImpl.readAll();
			
			if(a.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(a, HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Almacenes> crearAlmacenes(@Valid @RequestBody Almacenes cat) {
		//TODO: process POST request
		try {
			Almacenes almacenes = almacenesServiceImpl.crear(cat);
			return new ResponseEntity<>(almacenes, HttpStatus.ACCEPTED);
		
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAlmacenes(@PathVariable("id") Long id, @Valid @RequestBody Almacenes cat) {
		//TODO: process PUT request
		Optional<Almacenes> almacenes = almacenesServiceImpl.read(id);
		if (almacenes.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(almacenesServiceImpl.update(cat), HttpStatus.OK);
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Almacenes> readAlmacenes(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			Almacenes a = almacenesServiceImpl.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Almacenes> delAlmacenes(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			almacenesServiceImpl.delete(id);
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
