package com;

import java.util.Scanner;

public class Principal3 {
	public static void main (String[] args) {
		int r;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Ingresa el primer numero");
		  int x = sc.nextInt();
		  
		  Scanner scc = new Scanner(System.in);
		  System.out.println("Ingresa el segundo numero");
		  int y = scc.nextInt();
	if (y==0)	{
		System.out.println("Error");
	}
	else {
		r=x/y;
		System.out.println("El resultado de la division es "+ r);
	}
	
	}

}
