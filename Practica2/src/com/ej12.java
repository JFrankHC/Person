package com;

import java.util.Scanner;

public class ej12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double prom =0;
		int i=0;
		double sum=0;
		while(prom<26) {
		System.out.println("Ingresa la edad  ");
		double edad = sc.nextDouble();
		sum=sum+edad;
		i++;
		prom=sum/i;
		System.out.println("El promedio es:" +prom);
	}

}
}