package com.vti.backend;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exercise1_Backend {
	public void exercise1() {
		// Question 1
		System.out.println("------Question 1----------");
		float acc1Sallary, acc2Sallary;
		acc1Sallary = 5240.5f;
		acc2Sallary = 10970.055f;
		int acc1SallaryInt = (int) acc1Sallary;
		int acc2SallaryInt = (int) acc2Sallary;
		System.out.println("Lương Account 1 là: " + acc1SallaryInt);
		System.out.println("Lương Account 2 là: " + acc2SallaryInt);

		// Question 2
		System.out.println("\n------Question 2----------");
		Random random2 = new Random();
		int i = random2.nextInt(100000);
		System.out.printf("%05d", i);
		System.out.println();

		// question 3
		System.out.println("\n------Question 3----------");
		System.out.printf("%s%02d", "Hai số cuối của i: ", (i % 100));
		System.out.println();

		// question 4
		System.out.println("\n------Question 4----------");
		DecimalFormat decimalFormat4 = new DecimalFormat("#.##");
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Nhập số nguyên a: ");
		int a = scanner4.nextInt();
		System.out.println("Nhập số nguyên b: ");
		int b = scanner4.nextInt();
		while (b == 0) {
			System.out.println("Nhập số nguyên a: ");
			a = scanner4.nextInt();
			System.out.println("Nhập số nguyên b: ");
			b = scanner4.nextInt();
		}
		scanner4.close();
		float divison4 = (float) a / b;
		System.out.println("Thương của a và b là: " + decimalFormat4.format(divison4));

	}
}
