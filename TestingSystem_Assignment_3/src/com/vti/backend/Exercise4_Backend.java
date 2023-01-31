package com.vti.backend;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4_Backend {
	public void exercise4() {
		// question 1
		System.out.println("------ Question 1--------------");
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Input String:");
		String string1 = scanner1.nextLine();
		System.out.println("Number of characters: " + string1.length());

		// question 2
		System.out.println("\n------ Question 2--------------");
		System.out.println("String 1 input:");
		String string21 = scanner1.nextLine();
		System.out.println("String 2 input:");
		String string22 = scanner1.nextLine();
		System.out.println(string21 + " " + string22);

		// question 3
		System.out.println("\n------ Question 3--------------");
		System.out.println("Input String:");
		String string3 = scanner1.nextLine();
		String[] stringArray = string3.split(" ");
		String outputString = "";
		for (int i = 0; i < stringArray.length; i++) {
			String word = stringArray[i];
			String firstLetter = word.substring(0, 1).toUpperCase();
			String otherLetter = word.substring(1).toLowerCase();
			word = firstLetter + otherLetter;
			outputString += word + " ";
		}
		System.out.println("String: " + outputString);

		// question 4
		System.out.println("\n------ Question 4--------------");
		System.out.println("Input String:");
		String string4 = scanner1.nextLine();
		string4 = string4.toUpperCase();
		for (int i = 0; i < string4.length(); i++) {
			System.out.println("Kí tự thứ " + (i + 1) + " là: " + string4.charAt(i));
		}

		// question 5
		System.out.println("\n------ Question 5--------------");
		System.out.println("Input First name:");
		String firstname5 = scanner1.nextLine();
		System.out.println("Input Last name:");
		String lastname5 = scanner1.nextLine();
		System.out.println("Full name: " + firstname5 + " " + lastname5);

		// question 6
		System.out.println("\n------ Question 6--------------");
		System.out.println("Input First name:");
		String firstname6 = scanner1.nextLine();
		System.out.println("Input Middle name:");
		String middletname6 = scanner1.nextLine();
		System.out.println("Input Last name:");
		String lastname6 = scanner1.nextLine();
		System.out.println("Họ là: " + firstname6 + "\nTên đệm là: " + middletname6 + "\nTên là: " + lastname6);

		// question 7
		System.out.println("\n------ Question 7--------------");
		System.out.println("Input String:");
		String string7 = scanner1.nextLine();
		string7 = string7.trim();
		string7 = string7.replaceAll("\\s+", " ");
		String[] nameString = string7.split(" ");
		String fullNameString = "";
		for (int i = 0; i < nameString.length; i++) {
			String wordString = nameString[i];
			String firstLetter = wordString.substring(0, 1).toUpperCase();
			String otherLetter = wordString.substring(1).toLowerCase();
			wordString = firstLetter + otherLetter;
			fullNameString += wordString + " ";
		}
		System.out.println(fullNameString);

		// question 8
		System.out.println("\n------ Question 8--------------");
		String[] groups = { "Java test", "Java learning", "SQL", "Python" };
		for (String groupString : groups) {
			if (groupString.contains("Java")) {
				System.out.println(groupString);
			}
		}

		// question 9
		System.out.println("\n------ Question 9--------------");
		String[] groups2 = { "Java", "Java test", "Java learning", "SQL", "Python" };
		for (String groupString : groups2) {
			if (groupString.equals("Java")) {
				System.out.println(groupString);
			}
		}

		// question 10
		System.out.println("\n------ Question 10--------------");
		System.out.println("Input 1st String:");
		String string101 = scanner1.nextLine();
		System.out.println("Input 2nd String:");
		String string102 = scanner1.nextLine();
		String reverseString = "";
		for (int i = string101.length(); i >= 1; i--) {
			reverseString += string101.substring(i - 1, i);
		}
		if (reverseString.equals(string102)) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}

		// question 11
		System.out.println("\n------ Question 11--------------");
		System.out.println("Input String:");
		String string11 = scanner1.nextLine();
		int count11 = 0;
		String[] string11Array = string11.split("");
		for (int i = 0; i <= string11.length() - 1; i++) {
			if (string11Array[i].equals("a")) {
				count11++;
			}
		}
		System.out.println("Số lần xuất hiện kí tự a là: " + count11);

		// question 12
		System.out.println("\n------ Question 12--------------");
		System.out.println("Input String:");
		String string12 = scanner1.nextLine();
		String reverseString12 = "";
		for (int i = string12.length(); i >= 1; i--) {
			reverseString12 += string12.substring(i - 1, i);
		}
		System.out.println("Reverse String: " + reverseString12);

		// question 13
		System.out.println("\n------ Question 13--------------");
		System.out.println("Input String:");
		String string13 = scanner1.nextLine();
		Pattern pattern13 = Pattern.compile("([0-9])");
		Matcher matcher13 = pattern13.matcher(string13);
		if (matcher13.find()) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}

		// question 14
		System.out.println("\n------ Question 14--------------");
		System.out.println("Input String:");
		String string14 = scanner1.nextLine();
		String replaceString14 = string14.replace('e', '*');
		System.out.println("Replace 'e' to '*' string: " + replaceString14);

		// question 15
		System.out.println("\n------ Question 15--------------");
		System.out.println("Input String:");
		String string15 = scanner1.nextLine();
		String reverseString15 = "";
		string15 = string15.trim();
		string15 = string15.replaceAll("\\s+", " ");
		String[] splitString15 = string15.split(" ");
		for (int i = splitString15.length; i >= 1; i--) {
			reverseString15 += (splitString15[(i - 1)] + " ");
		}
		System.out.println("Reverse string: " + reverseString15);

		// question 16
		System.out.println("\n------ Question 16--------------");
		System.out.println("Input String:");
		String string16 = scanner1.nextLine();
		System.out.println("Input Int n:");
		int n = scanner1.nextInt();
		scanner1.close();
//		String[] splitString16 = string16.split("");
		String splitStringoutput = "";
		if (string16.length() < n) {
			System.out.println("KO");
		} else {
			for (int i = 0; i < string16.length() - 1; i += n) {
				splitStringoutput = string16.substring(i, i + n);
				System.out.println(splitStringoutput);
			}
		}
	}
}
