package com;

import java.util.Scanner;

public class Principal6 {

	public static void main (String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  Scanner scc = new Scanner(System.in);
		  System.out.println("Ingresa la cantidad de alumnos");
		  int alumnos = sc.nextInt();
		  int pago;
		  
		  
		  if(alumnos>=100){
			  System.out.println("El pago por alumnos es de 65 Euros");
			  pago=65*alumnos;
			  System.out.println("El pago a la compa�ia es de: "+ pago);
		  }
		  else if(alumnos>=50&& alumnos<100){
			  System.out.println("El pago por alumnos es de 70 Euros");
			  pago=70*alumnos;
			  System.out.println("El pago a la compa�ia es de: "+ pago);
		  }
		  else if(alumnos>=30 && alumnos<50){
			  System.out.println("El pago por alumnos es de 95 Euros");
			  pago=95*alumnos;
			  System.out.println("El pago a la compa�ia es de: "+ pago);
		  }
		  else if(alumnos<30){
			  
			  pago=4000/alumnos;
			  System.out.println("El pago por alumno es de"+ pago);
			  System.out.println("El pago a la compa�ia es de 4000 Euros ");
		  }
		  
		
}
}