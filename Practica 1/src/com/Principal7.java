package com;

import java.util.Scanner;

public class Principal7 {

	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Ingresa el resultado");
		  int x = sc.nextInt();
	
	switch(x) {
     
     case 1:
      System.out.println("Seis");
      break;
      
     case 2:
         System.out.println("Cinco");
         break;
         
     case 3:
         System.out.println("Cuatro");
         break;
         
     case 4:
         System.out.println("Tres");
         break;
         
     case 5:
         System.out.println("Dos");
         break;
         
     case 6:
         System.out.println("Uno");
         break;
         
     default :
         System.out.println("ERROR: Numero incorrecto");
	 }
}
}