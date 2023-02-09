package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email, userName, firstName, lastName, fullName;
	public int idPosition;
	public LocalDate createDate;

	// question 2
	// a
	public Account() {
	}

	// b
	public Account(int id, String email, String userName, String fullName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}

	// c
	public Account(int id, String email, String userName, String fullName, int idPosition) {
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.idPosition = idPosition;
		this.createDate = LocalDate.now();
	}

	// d
	public Account(int id, String email, String userName, String firstName, String lastName, int idPosition,
			LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idPosition = idPosition;
		this.createDate = createDate;
	}

	public Account(String string) {
		// TODO Auto-generated constructor stub
	}

	public String toprintAccount() {
		return "Account [id=" + id + ", " + (email != null ? "email=" + email + ", " : "")
				+ (userName != null ? "userName=" + userName + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (fullName != null ? "fullName=" + fullName + ", " : "") + "idPosition=" + idPosition + ", "
				+ (createDate != null ? "createDate=" + createDate : "") + "]";
	}

}
