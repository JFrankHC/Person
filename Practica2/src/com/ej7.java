package com;

public class ej7 {
	public static void main(String[] args) {
		double inv =700;
		int meses=0;
		while(inv<=1500) {
			inv=inv*1.02;
			meses++;
			System.out.println(inv);
		}
		System.out.println("La cantidad de meses en la que obtuvo m�s de 1500 es: " + meses);
	}

}
