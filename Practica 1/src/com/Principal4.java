package com;

import java.util.Scanner;

public class Principal4 {
	public static void main (String[] args) {
	
		  Scanner sc = new Scanner(System.in);
		  Scanner scc = new Scanner(System.in);
		  System.out.println("Ingresa la nota");
		  int nota = sc.nextInt();
		  
		  
		  System.out.println("Ingresa la edad");
		  int edad = sc.nextInt();
		
		  System.out.println("Ingresa el sexo F o M en mayusculas");
		  String sexo= scc.next();
		  
		  if (nota>=5 && edad>=18 && sexo=="H") {
			  System.out.println("Posible");
		  }
	      else if (nota>=5 && edad>=18 && sexo=="F"){
		  System.out.println("Aceptada");
		
	}
	else {
		System.out.println("No aceptada");
	}
}}
