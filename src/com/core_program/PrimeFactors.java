package com.core_program;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Program to find prime factors");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its prime factors");
		int number = scan.nextInt();
		for (int i = 2; i*i <= number; i++) {
			
			while(number%i == 0) {
	            
				System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         
	    	  System.out.println(number);
	      }
		System.out.println("This are the prime factors");
		scan.close();
		

	}

}
