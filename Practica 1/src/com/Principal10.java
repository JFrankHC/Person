package com;

import java.util.Scanner;

public class Principal10 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa los kilos a transportar");
	 int x = sc.nextInt();
	 int cobro;
	 if (x<=5) {
	 System.out.println("Ingresa la zona");
	 int y = sc.nextInt();
	 
	 if (y==1) {
		 cobro=24*x;
		 System.out.println("El cobro de la entrega es " +cobro);
	 }
	 else if (y==2) {
		 cobro=20*x;
		 System.out.println("El cobro de la entrega es " +cobro);
	 }
	 else if (y==3) {
		 cobro=21*x;
		 System.out.println("El cobro de la entrega es " +cobro);
	 }
	 else if (y==4) {
		 cobro=10*x;
		 System.out.println("El cobro de la entrega es " +cobro);
	 }
	 else if (y==5) {
		 cobro=18*x;
		 System.out.println("El cobro de la entrega es " +cobro);
	 }
	 
	 }
	 else {
		 System.out.println("La entrega ha sido rechazada");
			  
}}}