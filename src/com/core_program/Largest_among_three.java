package com.core_program;

import java.util.Scanner;

public class Largest_among_three {

	public static void main(String[] args) {
		System.out.println("Program for Largest among 3");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = scan.nextInt();
		System.out.println("Enter number 2");
		int num2 = scan.nextInt();
		System.out.println("Enter number 3");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(+num1+" in largest number");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(+num2+" is largest number");
		}
		else {
			System.out.println(+num3+" is largest number");
		}
		
		scan.close();
	}

}
