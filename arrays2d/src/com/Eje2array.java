package com;

public class Eje2array {
	public static void main(String[] args) {
		String texto = "Esto es un texto de prueba, 12000 pesos gana un jr promedio";
		texto=texto.toLowerCase();
		String[] abc = { "a", "b", "c", "d","e", "f", "g", "h", "i","j","k","l", 
				"m", "n", "o", "p", "q", "r", "s", "t", "o", "p", "q",
				"r", "s", "t","u", "v", "w", "x", "y", "z" };
		String cifrado = "";
		String numeros = "1234567890";
		for (int i = 0; i < texto.length(); i++) {

			System.out.println();
			String actual = Character.toString(texto.charAt(i));

			if (numeros.indexOf(actual) >= 0) {// si el caracter es un numero
				cifrado = cifrado + Integer.toBinaryString(Integer.parseInt(actual) + 1);
			} else if (actual.equals(" ")) {// evalua espacio en blanco
				cifrado = cifrado + "-";
			} else if (actual.equals("z")) {
				//
				cifrado = cifrado + "a";

			} else {
				for (int j = 0; j < abc.length; j++) {
					if (actual.equals(abc[j])) {
						cifrado = cifrado + abc[j + 1];
					}
				}
			}

		}
		System.out.println(cifrado);
	}
}
