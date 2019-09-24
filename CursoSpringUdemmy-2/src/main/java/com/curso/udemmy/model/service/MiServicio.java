package com.curso.udemmy.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IServicio{

	public String operacion() {
		
		return "ejecutando un proceso simple";
		
	}
}
