package com.orellanagil.backend.models.services.interfaces;

import java.util.List;

import com.orellanagil.backend.models.entities.Plaga;

public interface IPlagasService {
	
	public void save(Plaga c);
	public Plaga findById(Long id);
	public void delete(Long id);
	public void update(Long id);
	public List<Plaga> findAll();

}
