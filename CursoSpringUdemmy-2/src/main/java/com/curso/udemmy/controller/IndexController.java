package com.curso.udemmy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.udemmy.model.service.IServicio;


@Controller
public class IndexController {
	
	@Autowired
	private IServicio servicio;
	
	@GetMapping({"/index","","/"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
    
	
}
