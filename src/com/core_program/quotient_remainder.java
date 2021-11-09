package com.core_program;

import java.util.Scanner;

public class quotient_remainder {

	public static void main(String[] args) {
		System.out.println("Program to find quotient and remainder ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number which will be dividend");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd number which will be divisor");
		int num2 = scan.nextInt();
		float quotient = 0;
		float remainder = 0;
		quotient = num1/num2;
		remainder = num1%num2;
		System.out.println("The quotient we got after "+num1+"/"+num2+" = "+quotient);
		System.out.println("The remainder we got after "+num1+"%"+num2+" = "+remainder);
		scan.close();
		}

	}


