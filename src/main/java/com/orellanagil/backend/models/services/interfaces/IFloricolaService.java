package com.orellanagil.backend.models.services.interfaces;

import java.util.List;

import com.orellanagil.backend.models.entities.floricola;

public interface IFloricolaService {

	public void save(floricola c);
	public floricola findById(Long id);
	public void delete(Long id);
	public void update(Long id);
	public List<floricola> findAll();
	
}
