package com.orellanagil.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.orellanagil.backend.models.entities.Plaga;
import com.orellanagil.backend.models.services.interfaces.IPlagasService;


@RestController
@RequestMapping("/api/plaga")

public class PlagaController {
	@Autowired
	private IPlagasService service;
	@GetMapping("/{id}")
	public Plaga retrive(@PathVariable(value="id") Long id){
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Plaga> list(){
		return service.findAll();
	}

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Plaga create(@RequestBody Plaga pla) {		
		service.save(pla);
		return pla;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Plaga update(@RequestBody Plaga pla, @PathVariable Long id) {		 			
		service.save(pla);
		return pla;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}	
}
