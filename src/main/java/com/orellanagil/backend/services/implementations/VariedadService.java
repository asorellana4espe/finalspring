package com.orellanagil.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orellanagil.backend.models.dao.IVariedad;
import com.orellanagil.backend.models.entities.variedad;
import com.orellanagil.backend.models.services.interfaces.IVariedadService;

@Service
public class VariedadService implements IVariedadService{

	@Autowired
	private IVariedad dao;
	
	@Override
	public void save(variedad v) {
		this.dao.save(v);
	}

	@Override
	public variedad findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		variedad v = this.findById(id);
		dao.delete(v);	
	}

	@Override
	public void update(Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<variedad> findAll() {
		return (List<variedad>) dao.findAll();
	}

}
