package com.orellanagil.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orellanagil.backend.models.dao.ISupervisor;
import com.orellanagil.backend.models.entities.Supervisor;
import com.orellanagil.backend.models.services.interfaces.ISupervisorService;
@Service
public class SupervisorService implements ISupervisorService{
	@Autowired
	private ISupervisor dao;

	@Override
	public void save(Supervisor c) {
		dao.save(c);
	}

	@Override
	public Supervisor findById(Long id) {
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Supervisor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}