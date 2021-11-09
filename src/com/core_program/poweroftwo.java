package com.core_program;
import java.util.Scanner;

public class poweroftwo {
	
	public static void main(String[] args) {
		
		System.out.println("This program for power of 2\n");
		System.out.println("Enter a number till which you want to calculate power");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number < 0 || number > 31) {
			
			System.out.println("Number exceeds limit\nEnter number in range of 0-31");
		}
		else {
			
			for (int i = 0; i <= number; i++ ) {
				
				System.out.println(Math.pow(2, number));
			}
		}
		input.close();
	}

}
