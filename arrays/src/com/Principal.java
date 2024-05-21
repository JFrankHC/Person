package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
//		//Inicializar array solo indicando el tamaño
//		
//		int[] primerArray = new int [7];
//		
//		//llenar manualmente array
//		
//		primerArray[3] = 30;
//		
//		
//		//Averiguar el tamaño de un array
//		System.out.println(primerArray.length);
//		
//		//Imprimir una posición especifica
//		System.out.println(primerArray[3]);
//		System.out.println(Arrays.toString(primerArray));
//		
//		//LLenar un array con valores desde el inicio
//		
//		String[] array2 = {"","","","","f","h"};
//		System.out.println(array2.length);
//		System.out.println(Arrays.toString(array2));
//		array2[4]=null;
//		
		/*
		 * Llenar un array de String desde teclado, el array tendra su nombre y edad
		 * contar cuantas vocales hay e imprimir la sumatoria de los numeros 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] nombreArray = new String [7];
		char caracter;
		int cont=0;
		int num1=0, num2;
		int sum=0;
		for (int i = 0; i <7; i++) {
			System.out.println("Ingresa la letra: ");
			String nombre = sc.nextLine();
			nombreArray[i] = nombre ;
			caracter=nombre.charAt(0);
		
			
			if(caracter == 'a'||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u') {
				cont++;
			}
			if (i==5) {
				 num1 = Integer.parseInt(nombre);
			}
			else if (i==6) {
			 num2 = Integer.parseInt(nombre);
				sum=num1+num2;
			}
			
		}
		System.out.println(Arrays.toString(nombreArray));
		System.out.println("La cantidad de vocales es: "+ cont);
		System.out.println("La suma es: " + sum);
	}

}
