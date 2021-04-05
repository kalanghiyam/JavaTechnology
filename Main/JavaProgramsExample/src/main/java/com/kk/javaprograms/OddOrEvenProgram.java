package com.kk.javaprograms;

public class OddOrEvenProgram {

	/*
	 * Logic If number is divisible by 2 is called even else odd
	 * 
	 */

	public String OddOrEven(int num) {
		String status = "";
		status = ((num % 2) == 0) ? " Even " : " Odd ";

		return status;
	}
}
