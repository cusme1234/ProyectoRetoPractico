package com.curso.udemmy;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.curso.udemmy.model.domain.ItemFactura;
import com.curso.udemmy.model.domain.Producto;
import com.curso.udemmy.model.service.IServicio;
import com.curso.udemmy.model.service.MiServicio;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("camara",100);
		Producto producto2 = new Producto("bicicleta",200);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		
		return Arrays.asList(linea1,linea2);
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("mesa",100);
		Producto producto2 = new Producto("silla",200);
		Producto producto3 = new Producto("escritorio",300);
		Producto producto4 = new Producto("computador",400);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		ItemFactura linea3 = new ItemFactura(producto3,5);
		ItemFactura linea4 = new ItemFactura(producto4,6);
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
}
