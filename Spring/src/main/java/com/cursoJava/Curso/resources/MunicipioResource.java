package com.cursoJava.Curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoJava.Curso.entities.Municipio;
import com.cursoJava.Curso.services.MunicipioService;

@RestController
@RequestMapping(value = "/municipios")
public class MunicipioResource {

	@Autowired
	private MunicipioService service;
	
	@GetMapping
	public ResponseEntity<List<Municipio>> findAll() {
		List<Municipio> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Municipio> findById(@PathVariable Long id){
		Municipio obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
