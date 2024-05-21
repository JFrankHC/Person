package com;

import java.util.Scanner;

public class Principal9 {

	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el mes en numero");
		 int x = sc.nextInt();
				  {
				  
				  
				  switch(x) {
				     
				     case 1:
				     case 3:
				     case 5:
				     case 7:
				     case 8:
				     case 10:
				     case 12:
				     System.out.println("Este mes tiene 31 días");
				      break;
				      
				     
				     case 4:
				     case 6:
				     case 9:
				     case 11:
				     
				     System.out.println("Este mes tiene 30 días");
				         break;
				         
				     case 2:
				     System.out.println("Este mes tiene 28 días");
				         break;
				         
				     default: 
				     System.out.println("Numero de mes incorrecto");
				         
				  }
				
		
	}
				  
}
}