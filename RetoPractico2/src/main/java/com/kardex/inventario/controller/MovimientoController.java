package com.kardex.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kardex.inventario.model.Movimiento;
import com.kardex.inventario.service.MovimientoService;

@RestController
@RequestMapping("/cantidad")
public class MovimientoController {
	@Autowired
	MovimientoService movimientoService;
	
	  @PostMapping("/restar")
	  public String restarCantidad(@RequestBody Movimiento movimiento) {
	    	
	    	return movimientoService.restarCantidad(movimiento);
		  
	    }
	  
	  @PostMapping("/sumar")
	  public void sumarCantidad(Movimiento movimiento) {
	    	
	    	
	    }
	  
	 

}
