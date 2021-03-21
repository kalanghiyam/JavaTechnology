package com.kk.javaprograms;

public class LogicProgramExample3 {

	/*
	 * Multiplication of odd number from 1 to 20 Sum of Even number from 1 to 100
	 */
	public static void main(String[] args) {
		int even = 0, odd = 1;
		for (int i = 1; i <= 20; i += 2) {
			odd = odd * i;
		}

		for (int i = 2; i <= 100; i += 2) {
			even = even + i;
		}
		
		System.out.println("Multiplication of Odd numbers : "+odd+"  \nSum of Even numbers : "+even);

	}

}
