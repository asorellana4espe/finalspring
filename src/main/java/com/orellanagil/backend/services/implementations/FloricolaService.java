package com.orellanagil.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orellanagil.backend.models.dao.IFloricola;
import com.orellanagil.backend.models.entities.floricola;
import com.orellanagil.backend.models.services.interfaces.IFloricolaService;

@Service
public class FloricolaService implements IFloricolaService{

	@Autowired
	private IFloricola dao;
	
	@Override
	public void save(floricola f) {
		this.dao.save(f);
	}

	@Override
	public floricola findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		floricola f = this.findById(id);
		dao.delete(f);	
	}

	@Override
	public void update(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<floricola> findAll() {
		return (List<floricola>) dao.findAll();
	}

}
