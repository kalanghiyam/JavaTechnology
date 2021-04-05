package com.kk.javaprograms;

import java.util.Scanner;

public class BaseAndExponentExample {

	/*
	 * base = 5
	 * exponent = 3
	 * result = 5 * 5 * 5 = 125
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Base : ");
		int b = sc.nextInt();
		System.out.println("Exponent : ");
		int e = sc.nextInt();

		int result = 1, i = 1;
		do {
			result = result * b;
			i++;
		} while (i <= e);

		System.out.println("Result is " + result);
		sc.close();
	}

}
