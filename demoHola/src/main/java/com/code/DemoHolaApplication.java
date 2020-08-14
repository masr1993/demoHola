package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.code.DemoHolaApplication;
import com.code.service.IPersonaService;

@SpringBootApplication

public class DemoHolaApplication implements CommandLineRunner{
	@Autowired
	// esto inyecta la dependencia y no hace falta instanciarlo
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoHolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// service = new PersonaServiceImpl(); no hace falta por el @Autowired
		service.registrar("Miguel");
	}

}
