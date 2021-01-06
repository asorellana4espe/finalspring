package com.orellanagil.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.orellanagil.backend.models.entities.floricola;
import com.orellanagil.backend.models.services.interfaces.IFloricolaService;

@RestController
@RequestMapping("/api/floricola")
public class FloricolaController {

	@Autowired
	private IFloricolaService service;
		
	@GetMapping("/{id}")
	public floricola retrieve(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<floricola> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public floricola create(@RequestBody floricola flori) {		
		service.save(flori);
		return flori;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public floricola update(@RequestBody floricola flori, @PathVariable Long id) {		 			
		service.save(flori);
		return flori;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}	
	
}
