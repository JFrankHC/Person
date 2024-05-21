package com;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		int x = sc.nextInt();

		Scanner scc = new Scanner(System.in);
		System.out.println("Ingresa el segundo numero");
		int y = scc.nextInt();

		if (x > y) {
			System.out.println(x);
		} else if (x < y) {
			System.out.println(y);
		} else {
			System.out.println("Numeros iguales");
		}
	}

}
