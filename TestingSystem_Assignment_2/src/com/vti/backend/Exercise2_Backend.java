package com.vti.backend;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise2_Backend {
	public void exercise2() {
		// question1
		int i = 5;
		System.out.println("--------------Question 1---------------");
		System.out.println("i= " + i);

		// question2
		i = 100000000;
		NumberFormat nf2 = NumberFormat.getInstance(new Locale("en", "US"));
		String val2 = nf2.format(i);
		System.out.println("\n--------------Question 2---------------");
		System.out.println(val2);

		// question 3
		double j = 5.567098;
		NumberFormat nf3 = NumberFormat.getInstance(new Locale("en", "US"));
		nf3.setMaximumFractionDigits(4);
		String val3 = nf3.format(j);
		System.out.println("\n--------------Question 3---------------");
		System.out.println(val3);

		// question 4
		String string4 = "Nguyễn Văn A";
		System.out.println("\n--------------Question 4---------------");
		System.out.println("Tên tôi là " + string4 + " và tôi đang độc thân.");

		// question 5
		SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date5 = new Date();
		String date5String = simpleDateFormat5.format(date5);
		System.out.println("\n--------------Question 4---------------");
		System.out.println(date5String);

		// question 6
		// xem file Program_Backend //exercise 2 question 6
	}
}
