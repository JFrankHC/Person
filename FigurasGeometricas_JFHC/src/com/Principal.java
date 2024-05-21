package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Circulo ci=new Circulo();
		ci.setRadio(6);
		System.out.println("El area es: "+ ci.area(0)+" El perimetro es: "+ ci.perimetro(0)+ " El volumen es: "+ ci.volumen());
		Cuadrado cu=new Cuadrado();
		cu.setLado(5);
		System.out.println("El area es: "+ cu.area(0)+" El perimetro es: "+ cu.perimetro(0)+ " El volumen es: "+ cu.volumen());
		
		
		Hexagono hex= new Hexagono();
		hex.setLongitud(4);
		hex.setH(6);
		hex.setLado(5);

		System.out.println("El area es: "+ hex.area()+" El perimetro es: "+ hex.perimetro()+ " El volumen es: "+ hex.volumen());
		
		
		
		
		
		
	}

}
