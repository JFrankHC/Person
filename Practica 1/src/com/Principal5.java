package com;

import java.util.Scanner;

public class Principal5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);

		System.out.println("Ingresa el precio");
		Double precio = sc.nextDouble();
		System.out.println("Ingresa el tipo A o B");
		String tipo = scc.next();
		System.out.println("Ingresa el tama�o 1 o 2");
		Double tama�o = sc.nextDouble();
        System.out.println(tipo);
		if (tipo.equals("A") && tama�o == 1) {

			precio = precio + .20;
			System.out.println("El precio es: " + precio);
		} else if (tipo.equals("A") && tama�o == 2) {
			precio = precio + .30;
			System.out.println("El precio es: " + precio);
		}
		if (tipo.contentEquals("B") && tama�o == 1) {

			precio = precio - .30;
			System.out.println("El precio es: " + precio);
		} else if (tipo.contentEquals("B") && tama�o == 2) {
			precio = precio - .50;
			System.out.println("El precio es: " + precio);
		} else {
			System.out.println("Tipo incorrecto");
		}

	}
}