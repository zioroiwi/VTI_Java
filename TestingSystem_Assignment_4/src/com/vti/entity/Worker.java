package com.vti.entity;

public class Worker extends Staff {

	private int rank;

	// in thong tin

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public Worker() {
		super();
	}

	public Worker(String name, String address, Gender gender, int age, int rank) {
		super(name, address, gender, age);
		this.rank = rank;
	}

	public void toprintWorker() {
		System.out.println("--------Worker's Info:--------");
		System.out.println("Name: " + super.getName() + "\nAge: " + super.getAge() + "\nGender: " + super.getGender()
				+ "\nAddress: " + super.getAddress());
		System.out.println("Rank: " + this.rank);
	}
}
