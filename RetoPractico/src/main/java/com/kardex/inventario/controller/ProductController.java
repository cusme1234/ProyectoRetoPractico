package com.kardex.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kardex.inventario.model.Movimiento;
import com.kardex.inventario.model.Producto;
import com.kardex.inventario.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductController {
	
	@Autowired
	ProductoService productoService;
	
	//@GetMapping("/obtener")
    @RequestMapping(value="/obtener", method=RequestMethod.GET)
	public Producto getProducto() {
		
    	Producto producto = new Producto(); 
    	producto.setNombre("camisa");
    	producto.setCantidad(5);
    	producto.setValorUnitario(12.00);
    	producto.setFechaIngreso("19/08/2019");
    	producto.setIdProducto(1);
    	
		return producto;
	}
    @GetMapping("obtener/{id}")
    public Producto consultaProducto(@PathVariable("id") Integer idProducto) {
    	return productoService.consultarProduto(idProducto);
    }
    
    @GetMapping("")
    public List<Producto> consultarProductos(){
    	return productoService.consultarProductos();
    }
    
    @GetMapping("eliminar/{id}")
    public void eliminarProducto(@PathVariable("id") Integer idProducto) {
    	 productoService.eliminarProducto(idProducto);
    }
    
    @PostMapping("/agregar")
    public Producto agregarProducto(@RequestBody Producto producto) {
    	System.out.println("llegue");
    	return productoService.agregarProducto(producto);
    }
    
    
    @GetMapping("/agrega/{nombrePath}/{cantidadPath}")
    public void agregarCantidad(@PathVariable("nombrePath") String nombre, @PathVariable("cantidadPath") int catidad) {
    	
    }
    
  
    
}
 