package com.vti.entity;

public class Employee extends Staff {
	private String task;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Employee() {
		super();
	}

	public Employee(String name, String address, Gender gender, int age, String task) {
		super(name, address, gender, age);
		this.task = task;
	}

	// in thong tin
	public void toprintEmployee() {
		System.out.println("--------Employee's Info---------");
		System.out.println("Name: " + super.getName() + "\nAge: " + super.getAge() + "\nGender: " + super.getGender()
				+ "\nAddress: " + super.getAddress());
		System.out.println("Task" + this.task);
	}

}
