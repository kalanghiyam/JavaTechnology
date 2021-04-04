package com.kk.javaprograms;

public class PatternExample1 {

	public static void main(String[] args) {
		/*
		 * 1*****
		 * 12****
		 * 123***
		 * 1234**
		 * 123456
		 * */
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		/*
		 * 12345&
		 * 1234&&
		 * 123&&&
		 * 12&&&&
		 * 1&&&&&
		 * */
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=5;k>=i;k--) {
				System.out.print("&");
			}
			System.out.println();
		}
		
		/*
		 * @
		 * @ @
		 * @   @
		 * @    @
		 * @      @
		 * @ @ @ @ @
		 * */
		System.out.println("@");
		for(int i=1;i<=5;i++) {
			System.out.print("@");
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.println();
		}
		for(int k=5;k>=1;k--) {
			System.out.print("@ ");
		}

	}

}
