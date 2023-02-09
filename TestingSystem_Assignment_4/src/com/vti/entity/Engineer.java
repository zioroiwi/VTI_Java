package com.vti.entity;

public class Engineer extends Staff {
	private String specialized;

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

	public Engineer() {
		super();
	}

	public Engineer(String name, String address, Gender gender, int age, String specialized) {
		super(name, address, gender, age);
		this.specialized = specialized;
	}

	// in thong tin
	public void toprintEngineer() {
		System.out.println("--------Engineer's Info---------");
		System.out.println("Name: " + super.getName() + "\nAge: " + super.getAge() + "\nGender: " + super.getGender()
				+ "\nAddress: " + super.getAddress());
		System.out.println("Specialized: " + this.specialized);
	}
}
