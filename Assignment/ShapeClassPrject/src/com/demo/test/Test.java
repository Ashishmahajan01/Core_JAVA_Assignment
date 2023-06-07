package com.demo.test;

import java.util.Scanner;

import com.demo.service.ShapeService;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out
					.println("1.Add New Shape\n2.Display All\n3.Calculate Area and Perimeter\n4.exit\nEnter Choice :-");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1. Triangle \n 2. Rectangle \n 3. Circle\\n");
				int ch = sc.nextInt();
				ShapeService.addnewshape(ch);
				break;
			case 2:
				ShapeService.diplayAll();
				break;
			case 3:
				System.out.println("enetr id to search");
				int id = sc.nextInt();
				String data = ShapeService.CalculateDetails(id);
				if (data != null) {
					System.out.println("perimeter and area : " + data);
				} else {
					System.out.println("not found");
				}
				break;
			case 4:
				sc.close();
				System.out.println("Thank you for visiting....");
				break;
			default:
				System.out.println("Wrong choice");
			}

		} while (choice != 4);
		String ans = ShapeService.calculateNumber();
		System.out.println(ans);

	}

}
