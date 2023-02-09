package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Exercise5_Backend;

public class Exercise5_Frontend {
	public static void main(String[] args) {
		Exercise5_Backend exercise5_Backend = new Exercise5_Backend();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("+------------------------ Menu -------------------+");
			System.out.printf("|%-49s|%n", "                  Chọn từ 1 đến 6");
			System.out.println("+-------------------------------------------------+");
			System.out.printf("|%-49s|%n", "  1. Thêm mới cán bộ");
			System.out.printf("|%-49s|%n", "  2. Tìm kiếm theo họ tên");
			System.out.printf("|%-49s|%n", "  3. Hiện thị thông tin về danh sách các cán bộ");
			System.out.printf("|%-49s|%n", "  4. Nhập vào tên của cán bộ và delete cán bộ đó");
			System.out.printf("|%-49s|%n", "  5. Thoát khỏi chương trình");
			System.out.println("+-------------------------------------------------+");

			int chooseMenu = scanner.nextInt();

			switch (chooseMenu) {
			case 1:
				exercise5_Backend.addStaff();
				break;
			case 2:
				exercise5_Backend.findStaff();
				break;
			case 3:
				exercise5_Backend.staffInfo();
				break;
			case 4:
				exercise5_Backend.deleteStaff();
				break;
			case 5:
				return;
			default:
				System.out.println("Bạn chọn chưa đúng!!!");
				break;
			}
		}
	}
}
