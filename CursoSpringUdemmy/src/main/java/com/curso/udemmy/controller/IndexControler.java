package com.curso.udemmy.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.udemmy.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexControler {
	
	@Value("${textoIndex}")
	private String textoIndex;
	
	@Value("${textoPerfil}")
	private String textoPerfil;

	@Value("${textoListar}")
	private String textoListar;

	@GetMapping({"/index","/","","/home"})
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index"; 
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Nombre");
		usuario.setApellido("Apellido");
		usuario.setEmail("Ejemplo@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}
	
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Andres","Guzman","ejemplo@gmail.com"),
				new Usuario("jose","uribe","ejemplo@gmail.com"),new Usuario("sebastian","pizano","ejemplo@gmail.com"),
				new Usuario("manuel","ortega","ejemplo@gmail.com"));
		return usuarios;
		}
}
