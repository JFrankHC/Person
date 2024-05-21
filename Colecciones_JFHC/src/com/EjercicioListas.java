package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioListas {
	
	public static void main(String[] args) {

		int seleccion = 0;
		Scanner sc = new Scanner(System.in);
		List<Contacto> contactos = new ArrayList<Contacto>();
		String nombre = " ", telefono = " ", direccion = " ", correo = "";
		Contacto con = new Contacto(nombre, telefono, direccion, correo);

		do {
			System.out.println("1.Agregar");
			System.out.println("2.Buscar");
			System.out.println("3.Editar");
			System.out.println("4.Eliminar");
			System.out.println("5.Mostrar");
			System.out.println("6.salir");

			seleccion = sc.nextInt();
			
			switch (seleccion) {

			case 1:
				sc.nextLine();
				System.out.println("Ingrese el nombre");
				nombre = sc.nextLine();
				System.out.println("Ingrese el telefono");
				telefono = sc.nextLine();
				System.out.println("Ingrese la direccion");
				direccion = sc.nextLine();
				System.out.println("Ingrese un correo");
				correo = sc.nextLine();
				 con = new Contacto(nombre, telefono, direccion, correo);
				contactos.add(con);
				break;

			

			case 2:
				sc.nextLine();
				System.out.println("Introduzca el nombre que desea buscar ");
				nombre = sc.nextLine();
				Contacto con1=null;
				for (int i = 0; i < contactos.size();i++) {
					
					if (contactos.get(i).getNombre().equals(nombre)) {
					
						con1 = contactos.get(i);
						
					}
				}
				if (con1 != null) {
					System.out.println(con);
				} else {
					System.out.println("No existe");
				}

				break;
			case 3:
				sc.nextLine();
				System.out.println("Introduzca el nombre que desea editar ");
				nombre = sc.nextLine();
				con = null;
				for (int i = 0; i < contactos.size(); i++) {
					if (contactos.get(i).getNombre().equals(nombre)) {
						con = contactos.get(i);

					}
					if (con != null) {
						System.out.println("Introduzca el nuevo nombre ");
						nombre = sc.nextLine();
						con = new Contacto(nombre, telefono, direccion, correo);
						contactos.set(i, con);

					} else {
						System.out.println("No existe");
					}
					break;
				}

				break;
			case 4:
				sc.nextLine();
				System.out.println("Introduzca el numero que desea eliminar ");
				telefono = sc.nextLine();
				con = null;
				for (int i = 0; i < contactos.size();i++) {

				if (contactos.get(i).getTelefono().equals(telefono)) 
					con = contactos.get(i);
				    telefono = sc.nextLine();
					con = new Contacto(nombre, telefono, direccion, correo);
					contactos.remove(telefono);
					System.out.println(con);
					
					
				}
				

				break;
			case 5:
				System.out.println(con);
				break;
			default:
				System.out.println("ha salido");
				// Resolver aqui
			}

		} while (seleccion > 0 && seleccion <= 5);

	}

}
