package com.kk.javaprograms;

import java.util.Scanner;

public class LogicProgramExample2 {
	/*
	 * To find small and largest number in given 10 different numbers*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Num 1: ");
		int i = 2, small = 0, large = 0;
		int a = sc.nextInt();
		small = a;
		large = a;

		while (i <= 10) {
			System.out.println("Num " + i + ":");
			int b = sc.nextInt();
			if (b < small) {
				small = b;
			}
			if (b > large) {
				large = b;
			}
			i++;
		}
		System.out.println("Large :"+large+"\tSmall :"+small);
		sc.close();

	}

}
