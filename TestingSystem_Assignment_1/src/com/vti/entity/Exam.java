package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	public int id, code, duration;
	public String title;
	public CategoryQuestion categoryId;
	public Account creatorId;
	public LocalDate createDate;
}
