package com;

import java.util.Scanner;

public class Principal8 {
public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Ingresa el dia de la semana");
		  int x = sc.nextInt();
	
	switch(x) {
     
     case 1:
      System.out.println("Lunes");
      break;
      
     case 2:
         System.out.println("Martes");
         break;
         
     case 3:
         System.out.println("Miercoles");
         break;
         
     case 4:
         System.out.println("Jueves");
         break;
         
     case 5:
         System.out.println("Viernes");
         break;
         
     case 6:
         System.out.println("Sabado");
         break;
         
     case 7:
         System.out.println("Domingo");
         break;
         
     default :
         System.out.println("ERROR: Numero de d�a incorrecto");
	 }
}
}
