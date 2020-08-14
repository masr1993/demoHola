package com.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.Persona;
import com.code.repo.IPersonaRepo;


@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/gretting")
	public String getting(@RequestParam(name="name",required = true, defaultValue = "World")String name, Model model) {
		
		Persona p = new Persona();
		p.setIdPersona((int)(Math.random()*1000));
		p.setNombre(name);
		repo.save(p);
		
		
		model.addAttribute("name", name);
		return "gretting";
	}

}
