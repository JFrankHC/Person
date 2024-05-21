package com.ms_productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms_productos.entity.Productos;

@Repository
//Todas descienden de component
//Todas las consultas van aqui
public interface ProductoRepository extends JpaRepository<Productos, Integer> {
	
	

}
