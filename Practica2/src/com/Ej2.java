package com;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea el el número a multiplicar");
		int numero= sc.nextInt();
		System.out.println("Hasta donde desea multiplicar");
		int tope= sc.nextInt();
		int  i = 1;
		while(i <= tope) {
			
			System.out.println(numero + " x " + i +" = "+ i *numero);
			
			i++;
		}



	}
}
