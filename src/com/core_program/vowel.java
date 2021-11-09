package com.core_program;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		
		System.out.print(" Please enter the char to check: ");
		char c = scan.next().charAt(0);
		
		for(int i = 0; i < vowels.length ; i++) {
			if (c == vowels[i]) {
				flag = 1;
			}
		}
		
		if (flag == 0) 
			System.out.println(" It is a consonant");
		else
			System.out.println(" It is a vowel");
		
		scan.close();
		
	}
}
