package com;

import java.util.Scanner;

public class Principal13 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de horas trabajadas en la semana");
		 Double ht = sc.nextDouble();
		 Double pago;
		 Double he;
		 
		 if(ht<=40) {
			 pago=ht*16;
			 System.out.println("El pago es de: $ "+ pago);
		 }
		 if(ht>40) {
			 
			 he=ht-40;
			 he=he*20;
			 pago= (40*16)+(he);
			 System.out.println("El pago es de: $ "+ pago);
		 }

}
}