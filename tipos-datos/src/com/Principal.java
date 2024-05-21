package com;

public class Principal {//inicio de la clase 

public static void main (String[]args) { // inicio del main

	//tipos de datos: Primitivos vs objetos 
	
	//enteros
    byte b=4; //-128 127
    short s=10;// 32768 32767
    int i =999999999; //
    long l= 9999999;
    
    
    //decimales
    float f=123.235f;
    double d=4423.54656543;
    
    
    //caracteres y booleanos
    char c='t' ;
    boolean bol= true;//inicializacion con valores
    
    int x; //Inicializacion sin valor (solo aparto la referencia)
	
    //Objetos (wrappers)
	String m ="hola"; //asignación por valor directo
	Integer ii= 30;
	
	Character ch = new Character('G');//Inicialización por constructor
    Byte by = new Byte("30");
			
	Short sh = new Short("300");
	Long ll= new Long("3000");
	
	
	Float fl= new Float("200");
	Double db= new Double("200");
	Boolean bo= new Boolean("false");
			
	System.out.println(ii);
	System.out.println(m);
	System.out.println(ch);
	System.out.println(by);
	System.out.println(sh);
	System.out.println(ll);
	System.out.println(fl);
	System.out.println(db);
	System.out.println(bo);

	
	
	//Objetos wrappers
	//Integer
	//Characters
	//Byte
	//Short
	//Long
	
	//Float
	//Double
	//Boolean
	
	
	
    }// fin del main
	
	
}// fin de la clase 
