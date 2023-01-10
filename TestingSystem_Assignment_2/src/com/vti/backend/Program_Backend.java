package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Answer;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.CategoryQuestionName;
import com.vti.entity.Department;
import com.vti.entity.Exam;
import com.vti.entity.ExamQuestion;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Question;
import com.vti.entity.TypeQuestion;
import com.vti.entity.TypeQuestionName;

public class Program_Backend {
	public void Exercise1() {

		// khoi tao department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Marketing";
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Sale";
		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Security";
		Department department4 = new Department();
		department4.id = 4;
		department4.name = "HR";
		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Technician";

		// khoi tao position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Mail clerk";
		Position position2 = new Position();
		position2.id = 2;
		position2.name = "Customer service representative";
		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Security";
		Position position4 = new Position();
		position4.id = 4;
		position4.name = "Administrative assistant";
		Position position5 = new Position();
		position5.id = 5;
		position5.name = "Data entry clerk";

		// khai bao account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "account1@gmail.com";
		account1.userName = "account1";
		account1.fullName = "account1 name";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "account2@gmail.com";
		account2.userName = "account2";
		account2.fullName = "account2 name";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.now();
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "account3@gmail.com";
		account3.userName = "account3";
		account3.fullName = "account3 name";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.now();
		Account account4 = new Account();
		account4.id = 4;
		account4.email = "account4@gmail.com";
		account4.userName = "account4";
		account4.fullName = "account4 name";
		account4.department = department4;
		account4.position = position5;
		account4.createDate = LocalDate.now();
		Account account5 = new Account();
		account5.id = 5;
		account5.email = "account5@gmail.com";
		account5.userName = "account5";
		account5.fullName = "account5 name";
		account5.department = department5;
		account5.position = position5;
		account5.createDate = LocalDate.now();

		// khoi tao group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Soccer";
		group1.creatorId = account2;
		group1.createDate = LocalDate.now();
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Party";
		group2.creatorId = account1;
		group2.createDate = LocalDate.now();
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Learning";
		group3.creatorId = account5;
		group3.createDate = LocalDate.now();
		Group group4 = new Group();
		group4.id = 4;
		group4.name = "Travel";
		group4.creatorId = account3;
		group4.createDate = LocalDate.now();
		Group group5 = new Group();
		group5.id = 5;
		group5.name = "Gossip";
		group5.creatorId = account4;
		group5.createDate = LocalDate.now();

		// khoi tao Group accounts
		Account[] group1Accounts = new Account[3];
		group1Accounts[0] = account1;
		group1Accounts[1] = account2;
		group1Accounts[2] = account5;
		group1.accounts = group1Accounts;
		Account[] group2Accounts = new Account[3];
		group2Accounts[0] = account2;
		group2Accounts[1] = account3;
		group2Accounts[2] = account4;
		group2.accounts = group2Accounts;
		Account[] group3Accounts = new Account[2];
		group3Accounts[0] = account4;
		group3Accounts[1] = account5;
		group3.accounts = group3Accounts;
		Account[] group4Accounts = new Account[3];
		group4Accounts[0] = account3;
		group4Accounts[1] = account4;
		group4Accounts[2] = account5;
		group4.accounts = group4Accounts;
		Account[] group5Accounts = new Account[5];
		group5Accounts[0] = account1;
		group5Accounts[1] = account2;
		group5Accounts[2] = account3;
		group5Accounts[3] = account4;
		group5Accounts[4] = account5;
		group5.accounts = group5Accounts;

		// khoi tao Account groups
		Group[] account1Groups = new Group[2];
		account1Groups[0] = group1;
		account1Groups[1] = group2;
		account1.groups = account1Groups;
		Group[] account2Groups = new Group[3];
		account2Groups[0] = group1;
		account2Groups[1] = group2;
		account2Groups[2] = group5;
		account2.groups = account2Groups;
		Group[] account3Groups = new Group[3];
		account3Groups[0] = group2;
		account3Groups[1] = group4;
		account3Groups[2] = group5;
		account3.groups = account3Groups;
		Group[] account4Groups = new Group[4];
		account4Groups[0] = group2;
		account4Groups[1] = group3;
		account4Groups[2] = group4;
		account4Groups[3] = group5;
		account4.groups = account4Groups;
		Group[] account5Groups = new Group[4];
		account5Groups[0] = group1;
		account5Groups[1] = group3;
		account5Groups[2] = group4;
		account5Groups[3] = group5;
		account5.groups = account5Groups;

		// khoi tao Type questionạ
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = TypeQuestionName.Essay;
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = TypeQuestionName.Multiple_Choice;

		// khoi tao Category question
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = CategoryQuestionName.Java;
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = CategoryQuestionName.NET;
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = CategoryQuestionName.SQL;
		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = CategoryQuestionName.Postman;
		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.id = 5;
		categoryQuestion5.name = CategoryQuestionName.Ruby;

		// khoi tao cau hoi
		Question question1 = new Question();
		question1.content = "question1";
		question1.categoryId = categoryQuestion1;
		question1.typeId = typeQuestion1;
		question1.creatorId = account2;
		question1.createDate = LocalDate.now();
		Question question2 = new Question();
		question2.content = "question2";
		question2.categoryId = categoryQuestion5;
		question2.typeId = typeQuestion2;
		question2.creatorId = account1;
		question2.createDate = LocalDate.now();
		Question question3 = new Question();
		question3.content = "question3";
		question3.categoryId = categoryQuestion4;
		question3.typeId = typeQuestion2;
		question3.creatorId = account5;
		question3.createDate = LocalDate.now();
		Question question4 = new Question();
		question4.content = "question4";
		question4.categoryId = categoryQuestion5;
		question4.typeId = typeQuestion2;
		question4.creatorId = account3;
		question4.createDate = LocalDate.now();
		Question question5 = new Question();
		question5.content = "question5";
		question5.categoryId = categoryQuestion3;
		question5.typeId = typeQuestion1;
		question5.creatorId = account2;
		question5.createDate = LocalDate.now();

		// khoi tao Answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "answer1";
		answer1.questionId = question1;
		answer1.isCorrect = true;
		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "answer2";
		answer2.questionId = question2;
		answer2.isCorrect = false;
		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "answer3";
		answer3.questionId = question3;
		answer3.isCorrect = false;
		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.content = "answer4";
		answer4.questionId = question4;
		answer4.isCorrect = true;
		Answer answer5 = new Answer();
		answer5.id = 5;
		answer5.content = "answer5";
		answer5.questionId = question5;
		answer5.isCorrect = true;

		// khoi tao Exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = 1;
		exam1.title = "Code 001";
		exam1.categoryId = categoryQuestion1;
		exam1.duration = 90;
		exam1.creatorId = account3;
		exam1.createDate = LocalDate.now();
		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = 2;
		exam2.title = "Code 002";
		exam2.categoryId = categoryQuestion5;
		exam2.duration = 90;
		exam2.creatorId = account1;
		exam2.createDate = LocalDate.now();

		// khoi tao Exam question
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.id = 1;
		examQuestion1.questionId = question1;
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.id = 2;
		examQuestion2.questionId = question2;
		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.id = 3;
		examQuestion3.questionId = question3;
		ExamQuestion examQuestion4 = new ExamQuestion();
		examQuestion4.id = 4;
		examQuestion4.questionId = question4;
		ExamQuestion examQuestion5 = new ExamQuestion();
		examQuestion5.id = 5;
		examQuestion5.questionId = question5;

		// question 1
		System.out.println("------ Question 1 ----------------");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account2.department.name);
		}

		// question 2
		System.out.println("\n------ Question 2 ----------------");
		if (account2Groups.length == 0) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			if ((account2Groups.length == 1) || (account2Groups.length == 2)) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			} else {
				if (account2Groups.length == 3) {
					System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				} else {
					System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				}
			}
		}

		// question 3
		System.out.println("\n------ Question 3 ----------------");
		System.out.println((account2.department == null) ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + account2.department.name);

		// question 4
		System.out.println("\n------ Question 4 ----------------");
		System.out.println(account1.position.name == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");

		// question 5
		System.out.println("\n------ Question 5 ----------------");
		switch (group1Accounts.length) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}

		// question 6
		System.out.println("\n------ Question 6 ----------------");
		switch (account2Groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}

		// question 7
		System.out.println("\n------ Question 7 ----------------");
		switch (account1.position.name) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}

		// question 8
		System.out.println("\n------ Question 8 ----------------");
		Account[] acc = { account1, account2, account3, account4, account5 };
		for (Account account : acc) {
			System.out.println("Email: " + account.email + "; Tên: " + account.fullName + "; Phòng ban: "
					+ account.department.name);
		}

		// question 9
		System.out.println("\n------ Question 9 ----------------");
		Department[] dep = { department1, department2, department3, department4, department5 };
		for (Department department : dep) {
			System.out.println("ID: " + department.id + "; Name: " + department.name);
		}

		// question 10
		System.out.println("\n------ Question 10 ----------------");
		Account[] acc1 = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < acc1.length; i++) {
			System.out.println("\nThông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + acc1[i].email + "\nFull name: " + acc1[i].fullName + "\nPhòng ban: "
					+ acc1[i].department.name);
		}

		// question 11
		System.out.println("\n------ Question 11 ----------------");
		Department[] dep1 = { department1, department2, department3, department4, department5 };
		for (int i = 0; i < dep1.length; i++) {
			System.out.println("\nThông tin department thứ " + (i + 1) + " là:");
			System.out.println("Id: " + dep1[i].id + "\nName: " + dep1[i].name);
		}

		// question 12
		System.out.println("\n------ Question 12 ----------------");
		Department[] dep2 = { department1, department2 };
		for (int i = 0; i < dep2.length; i++) {
			System.out.println("\nThông tin department thứ " + (i + 1) + " là:");
			System.out.println("Id: " + dep2[i].id + "\nName: " + dep2[i].name);
		}

		// question 13
		System.out.println("\n------ Question 13 ----------------");
		Account[] acc2 = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < acc2.length; i++) {
			if (i != 1) {
				System.out.println("\nThông tin account thứ " + (i + 1) + " là:");
				System.out.println("Email: " + acc2[i].email + "\nFull name: " + acc2[i].fullName + "\nPhòng ban: "
						+ acc2[i].department.name);
			}
		}

		// question 14
		System.out.println("\n------ Question 14 ----------------");
		Account[] acc3 = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < acc3.length; i++) {
			if (i < 3) {
				System.out.println("\nThông tin account thứ " + (i + 1) + " là:");
				System.out.println("Email: " + acc3[i].email + "\nFull name: " + acc3[i].fullName + "\nPhòng ban: "
						+ acc3[i].department.name);
			}
		}

		// question 15
		System.out.println("\n------ Question 15 ----------------");
		for (int i = 0; i < 21; i += 2) {
			System.out.println(i);
		}

		// question 16
		System.out.println("\n------ Question 16 ----------------");
		System.out.println("--Question10-------");
		Account[] acc1610 = { account1, account2, account3, account4, account5 };
		int i = 0;
		while (i < acc1610.length) {
			System.out.println("\nThông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + acc1610[i].email + "\nFull name: " + acc1610[i].fullName + "\nPhòng ban: "
					+ acc1610[i].department.name);
			i++;
		}
		System.out.println("\n----Question11-----");
		Department[] dep1611 = { department1, department2, department3, department4, department5 };
		int j = 0;
		while (j < dep1611.length) {
			System.out.println("\nThông tin department thứ " + (j + 1) + " là:");
			System.out.println("Id: " + dep1611[j].id + "\nName: " + dep1611[j].name);
			j++;
		}

		// question 17
		System.out.println("\n------ Question 17 ----------------");
		System.out.println("--Question10-------");
		Account[] acc1710 = { account1, account2, account3, account4, account5 };
		int k = 0;
		do {

			System.out.println("\nThông tin account thứ " + (k + 1) + " là:");
			System.out.println("Email: " + acc1710[k].email + "\nFull name: " + acc1710[k].fullName + "\nPhòng ban: "
					+ acc1710[k].department.name);
			k++;
		} while (k < acc1710.length);

		System.out.println("--Question11-------");
		Department[] dep1711 = { department1, department2, department3, department4, department5 };
		int l = 0;
		do {
			System.out.println("\nThông tin department thứ " + (l + 1) + " là:");
			System.out.println("Id: " + dep1711[l].id + "\nName: " + dep1711[l].name);
			l++;
		} while (l < dep1611.length);
	}
}
