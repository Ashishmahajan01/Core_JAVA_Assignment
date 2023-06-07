package com.demo.test;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0;
		do {
		System.out.println("\t\t1.Add Employee\n\t\t2.Display All\n\t\t3.Display By id \n\t\t4.Display By Name \n\t\t5.Sort By Salary");
		System.out.println("\t\t6.Sort By Name \n\t\t7.Modify Salary \n\t\t8.Delete By id\n\t\t9.Exit");
		System.out.println("\tChoice:");
		choice =sc.nextInt();
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			sc.close();
			System.out.println("Sayonara!!!!");
			break;
		default:
			System.out.println("Invalid choice Please Renter Your Choice:");
			break;
		
		}
		
		}
		while(choice != 9);
	}

}
