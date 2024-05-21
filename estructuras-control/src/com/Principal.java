package com;

import java.util.Scanner;

public class Principal {

	public static void main (String[] args) {
		
		
		//Estructuras de control
		//if if-else, switch
		
//		int x= 50;
//		int y = 300;
		//AND OR NOT
		
	//	if (x < 30 && y > 10) {
		//	System.out.println("ok");
			
			
		//}
	//	else {
	//		System.out.println("reintenta");
	//	}
		
//	     if (x < 30  || y >= 40) {
//	    	 System.out.println("ok");
//	    	 
//	     }
//	     else {
//	    	 System.out.println("Reintenta");
//	     }
	     
//	 	if (!(x < 30 && y > 10)) {
			//	System.out.println("ok");
				
				
			//}
		//	else {
		//		System.out.println("reintenta");
		//	}
		
		/*Dado un numero, imprimir el mes del año.
		 * 
		 * 
		 */
		
		
//	     switch(x) {
//	     
//	     case 1:
//	      System.out.println("Enero");
//	      break;
//	     case 2:
//	      System.out.println("Febrero");
//	      break;
//	     case 3:
//	      System.out.println("Marzo");
//	      break;
//	     case 4:
//	      System.out.println("Abril");
//	      break;
//	     case 5:
//	      System.out.println("MAyo");
//	      break;
//	     case 6:
//	      System.out.println("Junio");
//	      break;
//	     case 7:
//	      System.out.println("Julio");
//	      break;
//	     case 8:
//	      System.out.println("Agosto");
//	      break;
//	     case 9:
//	      System.out.println("Septiembre");
//	      break;
//	     case 10:
//	      System.out.println("Octubre");
//	      break;
//	     case 11:
//	      System.out.println("Noviembre");
//	      break;
//	     case 12:
//	      System.out.println("Diciembre");
//	      break;
//	      
//	      default :
//	    	  System.out.println("valor desconocido");
//	     }
	    	
	     
		//Desde el teclado
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Ingresa un numero");
		  int xx = sc.nextInt();
		  System.out.println(xx);
		  
		  if(xx==1) {
		   System.out.println("Lunes");
		  }else if(xx==2) {
		   System.out.println("Martes");
		  }else if(xx==3) {
		   System.out.println("Miercoles");
		  }else {
		   System.out.println("Desconocido");
		  }
	    	 
	     }
	     
		
	}

