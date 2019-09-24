package com.kardex.inventario.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.el.ELException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kardex.inventario.model.Producto;
import com.kardex.inventario.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
    
	@Autowired
	ProductoRepository productoRepository;
	
	@Override
	public List<Producto> consultarProductos() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public Producto consultarProduto(Integer idProducto) {
		// TODO Auto-generated method stub
		Optional<Producto> producto = productoRepository.findById(idProducto);
		if(producto.isPresent())
			return productoRepository.findById(idProducto).get();
		else
			return null;
	}

	@Override
	public void eliminarProducto(Integer idProducto) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(idProducto);
	}

	@Override
	public Producto agregarProducto(Producto producto) {
		return productoRepository.save(producto);
		
	}

	@Override
	public void vender(Integer id, Integer cantidadAvender) throws Exception {
		Producto producto = consultarProduto(id);
		
		
		
	}

	private static void validarCantidaAvender(Integer cantidadAvender) throws Exception {
		if (cantidadAvender == null || cantidadAvender ) {
			throw new Exception("El id no puede ser nulo ni menor que uno");
		}
		
	private static void validarId(Integer id) throws Exception {
		if (id == null || id < 1) {
			throw new Exception("El id no puede ser nulo ni menor que uno");
		}
	}

}
