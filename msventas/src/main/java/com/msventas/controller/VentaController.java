package com.msventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Persistence.entity.Ventas;
import com.Persistence.request.VentasRequest;
import com.msventas.impl.VentaImplement;

@RestController
@RequestMapping("ventas/")
public class VentaController {
	@Autowired
	VentaImplement service;
	
	//http://localhost:8090/productos/mostrar-todos
	
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Ventas>> listar() {
		List<Ventas>list= service.mostrar();
		return new ResponseEntity<List<Ventas>>(list, HttpStatus.OK);
	}
	
	//http://localhost:8090/productos/buscar-por-id/5
	
	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity<Ventas> buscar(@PathVariable int id){
		Ventas e= service.buscar(id);
		return new ResponseEntity<Ventas>(e,HttpStatus.OK);
	}
	
	//http://localhost:8090/productos/guardar
	@PostMapping("guardar")
	public ResponseEntity<Ventas>guardar(@RequestBody VentasRequest req){
		//System.out.println("Controller: " + req.get());
		Ventas e=service.guardar(req);
		return new ResponseEntity<Ventas>(e, HttpStatus.OK);
	}
	
	
	//http://localhost:8090/productos/actualizar
	@PutMapping("actualizar")
	public ResponseEntity<Ventas>actualizar(@RequestBody VentasRequest req){
		
		Ventas e=service.actualizar(req);
		return new ResponseEntity<Ventas>(e, HttpStatus.OK);
	}
	
	//http://localhost:8090/productos/eliminar/5
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String>eliminar(@PathVariable int id){
		String mensaje=service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}


}
