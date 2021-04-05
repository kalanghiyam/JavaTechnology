package com.kk.javaprograms;

/**
 * Reference Websites 1. https://javatutoring.com/java-programs/ 2.
 * https://beginnersbook.com/2017/09/java-examples/
 *
 */
public class App {
	public static void main(String[] args) {
		
		// Add two numbers
		AddNumbers addNumbers = new AddNumbers();
		System.out.println("Addition of two numbers : " + addNumbers.add(44, 64));
		
		//OddOrEven Program
		OddOrEvenProgram oddOrEvenProgram = new OddOrEvenProgram();
		System.out.println("Given number is OddOrEven : "+oddOrEvenProgram.OddOrEven(44));
		System.out.println("Given number is OddOrEven : "+oddOrEvenProgram.OddOrEven(43));
	}
}
