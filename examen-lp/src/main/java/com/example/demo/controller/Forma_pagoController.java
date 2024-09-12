package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Forma_pago;
import com.example.demo.serviceImpl.Forma_pagoServiceImpl;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/forma_pago")
public class Forma_pagoController {
	
	@Autowired
	private Forma_pagoServiceImpl forma_pagoServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Forma_pago>> readAll() {
		try {
			List<Forma_pago> f = forma_pagoServiceImpl.readAll();
			
			if(f.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(f, HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Forma_pago> crearForma_pago(@Valid @RequestBody Forma_pago cat) {
		//TODO: process POST request
		try {
			Forma_pago forma_pago = forma_pagoServiceImpl.crear(cat);
			return new ResponseEntity<>(forma_pago, HttpStatus.ACCEPTED);
		
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateForma_pago(@PathVariable("id") Long id, @Valid @RequestBody Forma_pago cat) {
		//TODO: process PUT request
		Optional<Forma_pago> forma_pago = forma_pagoServiceImpl.read(id);
		if (forma_pago.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(forma_pagoServiceImpl.update(cat), HttpStatus.OK);
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Forma_pago> readForma_pago(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			Forma_pago f = forma_pagoServiceImpl.read(id).get();
			return new ResponseEntity<>(f, HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Forma_pago> delForma_pago(@PathVariable("id") Long id) {
		//TODO: process PUT request
		try {
			forma_pagoServiceImpl.delete(id);
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
