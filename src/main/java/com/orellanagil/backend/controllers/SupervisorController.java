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

import com.orellanagil.backend.models.entities.Supervisor;
import com.orellanagil.backend.models.entities.Supervisor;
import com.orellanagil.backend.models.services.interfaces.ISupervisorService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/supervisor")

public class SupervisorController {
	@Autowired
	private ISupervisorService service;
	@GetMapping("/{id}")
	public Supervisor retrive(@PathVariable(value="id") Long id){
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Supervisor> list(){
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Supervisor create(@RequestBody Supervisor superv) {		
		service.save(superv);
		return superv;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Supervisor update(@RequestBody Supervisor superv, @PathVariable Long id) {		 			
		service.save(superv);
		return superv;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
