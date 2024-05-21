package com;

public class Persona {
	//final a nivel de clase bloquea la herencia
	String nombre, sexo, peso;
	public static final String ALTURA_MAX="2.0";// constante
	
	//El final crea constantes 
	
	public Persona() {
		
	}


	public Persona(String nombre, String sexo, String peso) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.peso = peso;
		//this.altura = altura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


//	public String getAltura() {
//		return ALTURA_MAX = ALTURA_MAX;
//	}


//	public void setAltura(String altura) {
//		this.
//	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", peso=" + peso+ "]";
	}
	
	
	public final void hacerAlgo() {
		System.out.println("Estoy haciendo algo...");
	}


}
