package com;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea la palabra: ");
		String pal = sc.nextLine();
		System.out.println("Teclea la letra que deseas buscar: ");
		char caracter = sc.next().charAt(0);
		int longitud = pal.length();
		char letra;
		int j = 0;

		for (int i = longitud - 1; i >= 0; i--) {

			letra = pal.charAt(i);
			if (letra == caracter) {
				j++;
			}
			if (i == 0) {
				System.out
						.println(" El caracter " + caracter + " se encontr� " + j + " veces" + " en la palabra " + pal);
			}
		}

	}
}