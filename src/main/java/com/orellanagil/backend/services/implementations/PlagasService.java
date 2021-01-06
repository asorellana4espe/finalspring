package com.orellanagil.backend.services.implementations;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orellanagil.backend.models.dao.IPlaga;
import com.orellanagil.backend.models.entities.Plaga;
import com.orellanagil.backend.models.services.interfaces.IPlagasService;
@Service
public class PlagasService implements IPlagasService{
	@Autowired //Inyección  de dependencias
	private IPlaga dao;
	@Override
	public void save(Plaga c) {
		// TODO Auto-generated method stub
		dao.save(c);
	}

	@Override
	public Plaga findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Plaga c=this.findById(id);
		dao.delete(c);		
	}

	@Override
	public List<Plaga> findAll() {
		// TODO Auto-generated method stub
		return (List<Plaga>) dao.findAll();
	}

	@Override
	public void update(Long id) {
		// TODO Auto-generated method stub
		
	}
}
