package com.kardex.inventario.service;

import java.util.List;

import com.kardex.inventario.model.Producto;

public interface ProductoService {

	public List<Producto> consultarProductos();
	public Producto consultarProduto(Integer idProducto);
	public void eliminarProducto(Integer idProducto);
	public Producto agregarProducto(Producto producto);
	
	
}
