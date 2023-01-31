package com.vti.backend;

public class Exercise3_Backend {
	public void exercise3() {
		// question 1
		System.out.println("--------- Question 1----------------");
		int sallary = 5000;
		Float sallaryFloat = (float) sallary;
		System.out.printf("%s%.2f", "Tiền lương: ", sallaryFloat);
		System.out.println();

		// question 2
		System.out.println("\n--------- Question 2----------------");
		String value2 = "1234567";
		boolean boolean2 = value2 instanceof String;
		System.out.println("value = " + value2 + " is the instance of String? " + boolean2);
		int value2Integer = Integer.valueOf(value2);
		System.out.println("int value: " + value2Integer);

		// question 3
		System.out.println("\n--------- Question 3----------------");
		Integer value3 = 1234567;
		boolean boolean3 = value3 instanceof Integer;
		System.out.println("value = " + value3 + " is the instance of Integer? " + boolean3);
		int value3Integer = value3;
		System.out.println("int value: " + value3Integer);
	}
}
