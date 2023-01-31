package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Account;

public class Exercise2_Backend {
	public void exercise2() {
		Account[] accounts2 = new Account[5];
		for (int i = 1; i <= accounts2.length; i++) {
			Account account = new Account();
			account.id = i;
			account.email = "email" + i + "@gmail.com";
			account.fullName = "account" + i;
			account.createDate = LocalDate.now();
			System.out.println("Thông tin account " + i);
			System.out.println("ID: " + account.id + "\nEmail: " + account.email + "\nFull name: " + account.fullName
					+ "\nNgày tạo: " + account.createDate);
			System.out.println("----------------------------\n");
		}
	}
}
