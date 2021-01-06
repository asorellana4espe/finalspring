package com.orellanagil.backend.models.services.interfaces;

import java.util.List;

import com.orellanagil.backend.models.entities.variedad;

public interface IVariedadService {

	public void save(variedad c);
	public variedad findById(Long id);
	public void delete(Long id);
	public void update(Long id);
	public List<variedad> findAll();
	
}
