package com.core_program;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		System.out.println("Even or Odd");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for comparison");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println(+num+" is a even number");
		}
		else {
			
			System.out.println(+num+" is a odd number");
		}
		scan.close();
	}

}
