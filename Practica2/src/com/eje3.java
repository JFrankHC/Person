package com;

import java.util.Scanner;

public class eje3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea la palabra: ");
		String num = sc.nextLine();
		int longitud = num.length();
		String reversa = "";
		for (int i = longitud - 1; i >= 0; i--)
			reversa = reversa + num.charAt(i);
		if (num.equals(reversa))
			System.out.println("La palabra " + num + " is a palindrome.");
		else
			System.out.println("La palabra " + num + "  no es palindrome.");
	}
}
