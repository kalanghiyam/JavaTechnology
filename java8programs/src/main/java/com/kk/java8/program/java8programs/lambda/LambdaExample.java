package com.kk.java8.program.java8programs.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("KK");
		names.add("Kalanghiya Kumar");
		names.add("Kumar");
		
		names.forEach(s->System.out.println("Names are : "+s));

	}

}
