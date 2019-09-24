package com.kardex.inventario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kardex.inventario.model.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {
}
