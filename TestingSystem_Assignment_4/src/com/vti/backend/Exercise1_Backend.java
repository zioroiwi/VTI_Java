package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Exercise1_Backend {
	public void exercise1() {
// question 1
		Department dep11 = new Department();
		Department dep12 = new Department("Dep12");
// question 2
		System.out.println("-----------question2-----------");
		Account acc21 = new Account();
		System.out.println("account1" + acc21.toprintAccount());
		Account acc22 = new Account(2, "acc2@gmail.com", "acc2", "account2");
		System.out.println("account2" + acc22.toprintAccount());
		Position pos1 = new Position();
		pos1.id = 1;
		Account acc23 = new Account(3, "acc3@gmail.com", "acc3", "account3", pos1.id);
		System.out.println("account3" + acc23.toprintAccount());
		Account acc24 = new Account(4, "acc4@gmail.com", "acc4", "account", "4", pos1.id, LocalDate.of(2023, 2, 7));
		System.out.println("account4" + acc24.toprintAccount());
// question 3
		System.out.println("-----------question3-----------");
		Group group31 = new Group();
		System.out.println("Group 1:" + group31.toprintGroup());
		Account[] accounts = { acc21, acc22 };
		Group group32 = new Group(2, "Group 2", acc24.userName, accounts, LocalDate.now());
		System.out.println("Group 2: " + group32.toprintGroup());
		Group group33 = new Group(3, "Group 3", acc22.userName, accounts, null);
		System.out.println("Group 3: " + group33.toprintGroup());
	}
}
