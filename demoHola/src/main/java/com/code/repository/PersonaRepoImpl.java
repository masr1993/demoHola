package com.code.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.code.DemoHolaApplication;

@Repository
@Qualifier("persona1")
public class PersonaRepoImpl implements IPersonaRepo{

	private static Logger LOG = LoggerFactory.getLogger(DemoHolaApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a "+ nombre);
		
	}

}
