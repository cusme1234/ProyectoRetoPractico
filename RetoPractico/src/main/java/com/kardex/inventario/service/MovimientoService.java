package com.kardex.inventario.service;

import com.kardex.inventario.model.Movimiento;

public interface MovimientoService {

	public void restarCantidad(Movimiento movimiento);
	public void sumarCantidad(Movimiento movimiento);
	
}
