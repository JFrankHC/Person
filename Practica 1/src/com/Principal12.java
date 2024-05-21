package com;

import java.util.Scanner;

public class Principal12 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la cantidad a donar");
		 Double donativo = sc.nextDouble();
		 Double cs;
		 Double cn;
		 Double bolsa;
		 
		 if (donativo>10000) {
			 cs=donativo*.30;
			 cn=donativo*.50;
			 bolsa=donativo*.20;
			 System.out.println("Al centro de salud le corresponde: "+ cs);
			 System.out.println("Al comedor de niños le corresponde: "+ cn);
			 System.out.println("La inversión en la bolsa es: "+ bolsa);
		 }
		 
		 if (donativo<10000) {
			 cs=donativo*.25;
			 cn=donativo*.60;
			 bolsa=donativo*.15;
			 System.out.println("Al centro de salud le corresponde: "+ cs);
			 System.out.println("Al comedor de niños le corresponde: "+ cn);
			 System.out.println("La inversión en la bolsa es: "+ bolsa);
		 }
	}

}
