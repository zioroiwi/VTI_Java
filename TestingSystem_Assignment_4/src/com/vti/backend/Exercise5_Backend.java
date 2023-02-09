package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.entity.Employee;
import com.vti.entity.Engineer;
import com.vti.entity.Gender;
import com.vti.entity.Staff;
import com.vti.entity.Worker;

public class Exercise5_Backend {
	Scanner scanner = new Scanner(System.in);
	private ArrayList<Staff> listStaffs = new ArrayList<Staff>();

	// question 2
	// tao phuong thuc them nhan vien
	public void addStaff() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			showAddStaffMenu();
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				// them ki su
				Engineer engineer = new Engineer();
				System.out.println("Nhâp vào thồng tin kỹ sư:");
				// nhap ten
				System.out.println("Nhập tên:");
				String nameEngineer = scanner.next();
				engineer.setName(nameEngineer);
				// nhap tuoi
				System.out.println("Nhập tuổi:");
				int ageEngineer = scanner.nextInt();
				engineer.setAge(ageEngineer);
				// nhap dia chi
				System.out.println("Nhập địa chỉ:");
				String addressEngineer = scanner.next();
				engineer.setAddress(addressEngineer);
				// nhap chuyen nganh
				System.out.println("Nhập chuyên ngành đào tạo:");
				String specializedEngineer = scanner.next();
				engineer.setSpecialized(specializedEngineer);
				// nhap gioi tinh
				System.out.println("Mời bạn chọn giới tính:");
				System.out.println("1.Male, 2.Female, 3.Other:");
				int chooseGender = scanner.nextInt();
				switch (chooseGender) {
				case 1:
					engineer.setGender(Gender.Male);
					break;
				case 2:
					engineer.setGender(Gender.Female);
					break;
				case 3:
					engineer.setGender(Gender.Other);
					break;
				}
				// thuc hien luu ki su vao array list
				listStaffs.add(engineer);
				break;
			case 2:
				// them cong nhan
				Worker worker = new Worker();
				System.out.println("Nhâp vào thồng tin công nhân:");
				// nhap ten
				System.out.println("Nhập tên:");
				String nameWorker = scanner.next();
				worker.setName(nameWorker);
				// nhap tuoi
				System.out.println("Nhập tuổi:");
				int ageWorker = scanner.nextInt();
				worker.setAge(ageWorker);
				// nhap dia chi
				System.out.println("Nhập địa chỉ:");
				String addressWorker = scanner.next();
				worker.setAddress(addressWorker);
				// nhap chuyen nganh
				System.out.println("Nhập cấp độ:");
				int rank = scanner.nextInt();
				worker.setRank(rank);
				// nhap gioi tinh
				System.out.println("Mời bạn chọn giới tính:");
				System.out.println("1.Male, 2.Female, 3.Other:");
				int chooseGender2 = scanner.nextInt();
				switch (chooseGender2) {
				case 1:
					worker.setGender(Gender.Male);
					break;
				case 2:
					worker.setGender(Gender.Female);
					break;
				case 3:
					worker.setGender(Gender.Other);
					break;
				}
				// thuc hien luu ki su vao array list
//				ArrayList<Staff> listStaffs = new ArrayList<Staff>();
				listStaffs.add(worker);
				break;
			case 3:
				// them nhan vien
				Employee employee = new Employee();
				System.out.println("Nhâp vào thồng tin nhân viên:");
				// nhap ten
				System.out.println("Nhập tên:");
				String nameEmployee = scanner.next();
				employee.setName(nameEmployee);
				// nhap tuoi
				System.out.println("Nhập tuổi:");
				int ageEmployee = scanner.nextInt();
				employee.setAge(ageEmployee);
				// nhap dia chi
				System.out.println("Nhập địa chỉ:");
				String addressEmployee = scanner.next();
				employee.setAddress(addressEmployee);
				// nhap cong viec
				System.out.println("Nhập công việc:");
				String task = scanner.next();
				employee.setTask(task);
				// nhap gioi tinh
				System.out.println("Mời bạn chọn giới tính:");
				System.out.println("1.Male, 2.Female, 3.Other:");
				int chooseGender3 = scanner.nextInt();
//				Gender genderEmployee = null;
				switch (chooseGender3) {
				case 1:
					employee.setGender(Gender.Male);
//					genderEmployee = Gender.Male;
					break;
				case 2:
					employee.setGender(Gender.Female);
//					genderEmployee = Gender.Female;
					break;
				case 3:
					employee.setGender(Gender.Other);
//					genderEmployee = Gender.Other;
					break;
				}
				// thuc hien luu ki su vao array list
//				ArrayList<Staff> listStaffs = new ArrayList<Staff>();
				listStaffs.add(employee);
				break;
			case 4:
				return;
			default:
				System.out.println("Chọn lại");
				break;
			}
		}
	}

	// tao phuong thuc tim kiem
	public void findStaff() {
		System.out.println("---------Staff search--------");
		String nameSearch = scanner.next();
		for (Staff staff : listStaffs) {
			if (staff.getName().equals(nameSearch)) {
//				System.out.println(staff);
				System.out.println(staff);
			}
		}
	}

	// tao phuong thuc hien thi thong tin
	public void staffInfo() {
//		while (true) {
//			showStaffInfoMenu();
//			int chooseStaffInfo = scanner.nextInt();
//			switch (chooseStaffInfo) {
//			case 1:
//				
//				break;
//			case 2:
//
//				break;
//			case 3:
//
//				break;
//
//			default:
//				break;
//			}
//		for (Staff staff : listStaffs) {
//			System.out.println(staff);
//		}
//		su dun iterator de duyet mang
		System.out.println("---------- Staff list----------\n");
		Iterator<Staff> iteratorStaff = listStaffs.iterator();
		while (iteratorStaff.hasNext()) { // neu con lap thi tra ve true
			Staff staff = iteratorStaff.next(); // tra ve 1 phan tu trong mang
			System.out.println(staff);
		}
		System.out.println("\n/////////////////////////////////\n");

	}

	// tao phuong thuc xoa nhan vien
	public void deleteStaff() {
		System.out.println("---------- Delete Staff---------\n");
		Iterator<Staff> iteratorDelStaff = listStaffs.iterator();
		System.out.println("Choose name to delete:");
		String delStaff = scanner.next();
		while (iteratorDelStaff.hasNext()) {
			Staff staff = iteratorDelStaff.next();
			if (staff.getName().equals(delStaff)) {
				iteratorDelStaff.remove();
			}
		}
	}

	// tao phuong thuc show menu
	public void showAddStaffMenu() {
		System.out.println("+-----------------Thêm mới cán bộ ----------------+");
		System.out.printf("|%-49s|%n", "                  Chọn từ 1 đến 4");
		System.out.println("+-------------------------------------------------+");
		System.out.printf("|%-49s|%n", "  1. Thêm kỹ sư");
		System.out.printf("|%-49s|%n", "  2. Thêm công nhân");
		System.out.printf("|%-49s|%n", "  3. Thêm nhân viên");
		System.out.printf("|%-49s|%n", "  4. Thoát");
		System.out.println("+-------------------------------------------------+");
	}

	// tao phuong thuc show menu thong tin nhan vien
	public void showStaffInfoMenu() {
		System.out.println("+-----------------Thông tin cán bộ ----------------+");
		System.out.printf("|%-49s|%n", "                  Chọn từ 1 đến 4");
		System.out.println("+-------------------------------------------------+");
		System.out.printf("|%-49s|%n", "  1. Thông tin kỹ sư");
		System.out.printf("|%-49s|%n", "  2. Thông tin công nhân");
		System.out.printf("|%-49s|%n", "  3. Thông tin nhân viên");
		System.out.printf("|%-49s|%n", "  4. Thoát");
		System.out.println("+-------------------------------------------------+");
	}
}
