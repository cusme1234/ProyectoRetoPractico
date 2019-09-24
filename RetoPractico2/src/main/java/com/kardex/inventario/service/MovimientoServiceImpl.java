package com.kardex.inventario.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kardex.inventario.model.Movimiento;
import com.kardex.inventario.model.Producto;
import com.kardex.inventario.repository.ProductoRepository;

@Service
public class MovimientoServiceImpl implements MovimientoService {
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public String restarCantidad(Movimiento movimiento) {
		// TODO Auto-generated method stub
		Optional<Producto> producto = productoRepository.findById(movimiento.getId());
		if(!producto.isPresent())
			return "el id no existe";
		
		Integer cantidad = producto.get().getCantidad();
	

		if(cantidad < movimiento.getCantidad()) {
			return "no se puede realizar la transaccion porque el movimiento supera el numero de existencias ";
		}else {
			cantidad = cantidad-movimiento.getCantidad();
			producto.get().setCantidad(cantidad);
			productoRepository.save(producto.get());
			return "exitoso";
		}
	}

	
	
	
	@Override
	public void sumarCantidad(Movimiento movimiento) {
		// TODO Auto-generated method stub
		
	}

}
