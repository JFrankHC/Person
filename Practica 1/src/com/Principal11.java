package com;

import java.util.Scanner;

public class Principal11 {
	public static void main (String[] args) {
		
		Double IMC;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el peso en KG");
		 Double peso = sc.nextDouble();
		 System.out.println("Ingresa la altura en metros");
		 Double altura = sc.nextDouble();
		 
		 IMC= peso/(altura*altura);
		 
		 if (IMC<=16) {
			System.out.println("El indice de masa corporal es de: " + IMC+ " El diagnostico es: Criterio de ingreso a hospital "); 
		 }
		 else if (IMC>16&& IMC <=17) {
				System.out.println("El indice de masa corporal es de: " + IMC+ " El diagnostico es: Infrapeso "); 
			 }
		 else if (IMC>17&& IMC <=18) {
				System.out.println("El indice de masa corporal es de: " + IMC+ " El diagnostico es: Bajo peso "); 
			 }
		 else if (IMC>=18&& IMC <=25) {
				System.out.println("El indice de masa corporal es de: " + IMC+ " El diagnostico es: Peso normal (saludable) "); 
			 }
		 else if (IMC>=25&& IMC <=30) {
				System.out.println("El indice de masa corporal es de: " + IMC+ " El diagnostico es: Sobrepeso (obesidad grado I) "); 
			 }
		 else if (IMC>=30 && IMC <=35) {
				System.out.println("El indice de masa corporal es de: " + IMC+ " El diagnostico es: Sobrepeso crónico (obesidad grado II) "); 
			 }
		 else if (IMC>=35 && IMC <=40) {
				System.out.println("El indice de masa corporal es de: " + IMC+ " El diagnostico es: Obesidad premorvida (obesidad grado IV) "); 
			 }
		 else if (IMC>40) {
				System.out.println("El indice de masa corporal es de: " + IMC+ " El diagnostico es: Obesidad premorvida (obesidad grado IV) "); 
			 }

		 
}
}