package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	public int id;
	public String groupName;
	public String creator;
	public Account[] accounts;
	public LocalDate createDate;

	// question 3
	// a
	public Group() {
	}

	// b
	public Group(int id, String groupName, String creator, Account[] accounts, LocalDate createDate) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}

	// c
	public Group(int id, String groupName, String creator, String[] usernames, LocalDate createDate) {
		this.id = id;
		this.groupName = groupName;
		this.creator = creator;
		// tao account username
		Account[] accounts = new Account[usernames.length];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(usernames[i]);
		}
		this.createDate = createDate;
	}

	public String toprintGroup() {
		return "Group [id=" + id + ", " + (groupName != null ? "groupName=" + groupName + ", " : "")
				+ (creator != null ? "creator=" + creator + ", " : "")
				+ (accounts != null ? "accounts=" + Arrays.toString(accounts) + ", " : "")
				+ (createDate != null ? "createDate=" + createDate : "") + "]";
	}

}
