package com;

import java.util.Arrays;

//Composici�n
public class Auto {
	
	String modelo, marca, color, gama;
	
	Motor motor; //atributo objeto
	String [] interiores;
	
	public Auto() {
		
	}

	public Auto(String modelo, String marca, String color, String gama, Motor motor, String[] interiores) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.gama = gama;
		this.motor = motor;
		this.interiores = interiores;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String[] getInteriores() {
		return interiores;
	}

	public void setInteriores(String[] interiores) {
		this.interiores = interiores;
	}

	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", gama=" + gama + ", motor="
				+ motor + ", interiores=" + Arrays.toString(interiores) + "]";
	}
	

}
