package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

//	ciclos
//	while, do-while, for
		int zz = 15;
		// Primero evalua la condicion y si es true, ejecuta una vez el código

//	while(zz>10) {
//		System.out.println("hola");
//		zz--; //variable de control
		// }

		// recibir por teclado una lista de 10 num enteros
		// hacer la sumatoria e imprimir el resultado
		Scanner sc = new Scanner(System.in);
		int suma=0;
		int numero= 0;
		int tope= 0;
		
//		while (zz < 10) {
//			
//			System.out.println("ingresa un numero entero, iteracion: "+ zz);
//			numero = sc.nextInt();
//			suma = suma + numero;
//			zz+=2;
//
//		}
//		
//		System.out.println("resultado: "+ suma);
		
		
		//Primero ejecuta tofo el código una vez y luego 
		//pregunta si continua haciendolo 
//		do {
//			System.out.println("Hola al menos una vez");
//		}while (zz<5);{
			
			
			
	//	}
		/*
		 * Realizar una tabla de multiplicar de cualquier numero
		 * (mostrar los numeros pares)
		 * 
		 */
		//for 
		System.out.println("Ingresa el numero a multiplicar");
		numero = sc.nextInt();
		System.out.println("Ingresa hasta donde voy a multiplicar");
		tope = sc.nextInt();
		for (int i = 0; i < tope; i++) {
			
			if (i%2==0) {
				
				System.out.println(numero + " x "+ i + " = " + numero * i );
			} 
			
		}
	}

}