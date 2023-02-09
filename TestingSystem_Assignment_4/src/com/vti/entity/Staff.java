package com.vti.entity;

public class Staff {
	private String name, address;
	private Gender gender;
	private int age;

	public Staff() {
	}

	public Staff(String name, String address, Gender gender, int age) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	// in thong tin
	public void toprintStaffInfo() {

	}

	@Override
	public String toString() {
		return "Staff [" + (name != null ? "name=" + name + ", " : "")
				+ (address != null ? "address=" + address + ", " : "")
				+ (gender != null ? "gender=" + gender + ", " : "") + "age=" + age + "]";
	}

}
