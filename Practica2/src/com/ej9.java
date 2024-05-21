package com;

import java.util.Scanner;

public class ej9 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Teclea el numero: ");
	int num = sc.nextInt();
	System.out.println("Teclea otro numero: ");
	int num2 = sc.nextInt();
	
	if(num<num2) {
	
	for ( int i = num; i <= num2; i++) {
		if(i%2==0) {
		System.out.println(i);
	}}
	}
	else {
		for ( int j = num2; j <= num; j++) {
			if(j%2==0) {
			System.out.println(j);
		}}
}
}
}