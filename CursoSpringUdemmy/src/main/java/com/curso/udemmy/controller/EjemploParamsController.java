package com.curso.udemmy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/")
	public String index() {
		
		return "params/index";
	}
	
	@GetMapping("/string")
	public String param(@RequestParam(required = false, defaultValue = "No ha ingresado nada") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es: "+ texto);
		return "params/ver";
		
	}
	
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludar,@RequestParam Integer numero, Model model) {
		model.addAttribute("resultado", "El texto enviado es: '"+ saludar +"' y el numero es '"+ numero +"'");
		return "params/ver";
		
		
	}
	
	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		String saludar = request.getParameter("saludar");
		Integer numero = null;
		try {
			numero = Integer.parseInt(request.getParameter("numero"));
		}catch(NumberFormatException e){
			numero = 0;
		}
		model.addAttribute("resultado", "El texto enviado es: '"+ saludar +"' y el numero es '"+ numero +"'");
		return "params/ver";
	}
}