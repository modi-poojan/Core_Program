package com.core_program;

import java.util.Scanner;

public class head_tail {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lets start \nEnter the number of time you want to flip the coin");
		double flip_times = input.nextDouble();
		double head_count = 0.0;
		double tail_count = 0.0;
		double toss_result = 0.0;
		double head_percentage = 0.0;
		double tail_percentage = 0.0;
		
		for (int i = 1; i <=flip_times; i++) {
			
			toss_result = Math.random();
			
			if (toss_result < 0.5) {
				
				System.out.println("Result is tail");
				tail_count += 1;	
			}
			else {
				
				System.out.println("Result is head");
				head_count +=1;
			}
		}
		head_percentage = ((head_count/flip_times)*100);
		tail_percentage = ((tail_count/flip_times)*100);
		System.out.println("Total number of heads occured are = "+head_count+"\nThe percentage of head occurance = "+head_percentage);
		System.out.println("Total number of tails occured are = "+tail_count+"\nThe percentage of tail occurance ="+tail_percentage);
		input.close();
	}
}
