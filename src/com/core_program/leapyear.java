package com.core_program;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		
		System.out.println("Program to check whether the entered year is leap year");
		System.out.println("Please enter a year to check");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
			
			System.out.println("Entered year "+year+" is a leap year");
		}
		else {
			
			System.out.println("Entered year "+year+" is not a leap year");
		}
		input.close();
	}

}
