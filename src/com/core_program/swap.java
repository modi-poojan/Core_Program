package com.core_program;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		System.out.println("This program if for swapping");
		System.out.println("Enter 1st numbers for swapping");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd numbers for swapping");
		int num2 = scan.nextInt();
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Numbers after swapping are");
		System.out.println("1st number is = "+num1);
		System.out.println("2nd number is = "+num2);
		scan.close();		
				

	}

}
