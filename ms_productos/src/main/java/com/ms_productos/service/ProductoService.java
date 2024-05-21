package com.ms_productos.service;

import java.util.List;

import com.ms_productos.entity.Productos;
import com.ms_productos.request.ProductoRequest;
//Interface de logica de negocios
//Las operaciones particulares del negocios que se van a resolver
public interface ProductoService {

	Productos guardar(ProductoRequest request);
	Productos actualizar(ProductoRequest request);
	Productos buscar (int id);
	String eliminar(int id);
	List mostrar();
}
