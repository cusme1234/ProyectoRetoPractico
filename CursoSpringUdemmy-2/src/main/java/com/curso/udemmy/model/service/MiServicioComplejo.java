package com.curso.udemmy.model.service;

import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{

	public String operacion() {
		
		return "ejecutando un proceso Complejo";
		
	}
}
