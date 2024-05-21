package com;

import java.util.Scanner;

public class ej10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sump = 0;
		int sumi = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Teclea el numero: ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("El numero: " + num + " es par");
			} else {
				System.out.println("El numero: " + num + " es impar");
				sumi=sumi+num;
			}
			if (num > 0) {
				System.out.println("El numero: " + num + " es positivo");
				sump=sump+num;
				
			} else {
				System.out.println("El numero: " + num + " es negativo");
			}
			
		}
		System.out.println("La suma de los impares es: "+ sumi);
		System.out.println("La suma de los positivos es: "+ sump);
	}
}
