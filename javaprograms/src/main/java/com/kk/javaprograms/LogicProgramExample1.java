package com.kk.javaprograms;

import java.util.Scanner;

public class LogicProgramExample1 {

	/*
	 * Rows: 5
	 * Cols: 3
	 * 
	 * BBB
	 * BBB
	 * BBB
	 * BBB
	 * BBB
	 * 
	 * */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows : ");
		int rows = sc.nextInt();
		System.out.println("Cols : ");
		int cols = sc.nextInt();

		if (rows <= 0 && cols <= 0) {
			//print error
		} else {
			for (int i = 1; i <= rows; i++) {
				for (int j = 1; j <= cols; j++) {
					System.out.print("B");
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
