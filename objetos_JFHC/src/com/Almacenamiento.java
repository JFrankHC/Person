package com;

public class Almacenamiento {
	
	String tipo, marca, modelo;
	int capacidad;
	
	
	public Almacenamiento() {
		
	}


	public Almacenamiento(String tipo, String marca, String modelo, int capacidad) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "Almacenamiento [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad
				+ "]";
	}
	
	

}
