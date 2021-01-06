package com.orellanagil.backend.models.services.interfaces;

import java.util.List;

import com.orellanagil.backend.models.entities.Supervisor;

public interface ISupervisorService {
	
	public void save(Supervisor c);
	public Supervisor findById(Long id);
	public void delete(Long id);
	public void update(Long id);
	public List<Supervisor> findAll();
	
}
