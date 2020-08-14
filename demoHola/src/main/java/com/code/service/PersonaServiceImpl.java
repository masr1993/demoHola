package com.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.code.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{
	@Autowired
	@Qualifier("persona1")
	private IPersonaRepo repo;
	@Override
	public void registrar(String nombre) {
		// repo = new PersonaRepoImpl(); No hace falta por el @service
		repo.registrar(nombre);
		
	}

}
