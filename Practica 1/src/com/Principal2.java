package com;

import java.util.Scanner;

public class Principal2 {
	public static void main (String[] args) {
		int r;
		Scanner sc = new Scanner(System.in);
		  System.out.println("Ingresa un numero");
	
		  int x = sc.nextInt();
		  r=x%2;
		  if (r==0) {
			  
			  System.out.println(x+ " es un numero par");
		  }
		  else {
			  System.out.println(x+ " es un numero impar");
		  }
	}
}
