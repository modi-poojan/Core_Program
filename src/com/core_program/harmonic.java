package com.core_program;

import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		System.out.println("This program is for harmonic number");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for which you want to find harmonic value ");
		double number = scan.nextDouble();
		double result = 0;
		for (double i=1; i<=number; i++) {
			
			result = result + (1/i);
		}
		System.out.println("The harmonic value of "+number+" is "+result);
		scan.close();
	}
	
}
