package com;

import java.util.Scanner;

public class ej11 {
	public static void main(String[] args) {
		



		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea el largo  ");
		int tam = sc.nextInt();	
		System.out.println("Teclea el ancho ");
		int tam1 = sc.nextInt();	

		for (int i = 0; i < tam; i++) {
			
			for (int j = 0; j < tam1; j++) 
				System.out.print(" * ");			
			    System.out.println();

		}
	}

}
