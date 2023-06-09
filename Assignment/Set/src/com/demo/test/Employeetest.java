package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmplyoeeServiceImpl;

public class Employeetest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmplyoeeServiceImpl();
		int choice = 0;
		do {
			System.out.println("\t\t1. Add new Employee\n\t\t2. Display all\n\t\t3. Display by id\n\t\t4. Display by name");
			System.out.println("\t\t5. sort by sal\n\t\t6. sort by name\n\t\t7. modify sal\n\t\t8. delete by id\n\t\t9.exit");
			System.out.println("choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				es.addnewEmployee();
				break;
			case 2:
				Set<Employee> s = es.displayAll();
				s.forEach(a -> {
					System.out.println(a);
				});
				System.out.println();
				break;
			case 3:
				Employee res = es.displayById();
				if(res != null)
					System.out.println(res);
				else
					System.out.println("Not Found!!! :)");
				System.out.println();
				break;
			case 4:
				s =es.displayByName();
				System.out.println(s);
				System.out.println();
				break;
			case 5:
				List<Employee> ls = new ArrayList<>();
				ls=es.sortBySal();
				ls.forEach(a -> {
					System.out.println(a);
				});
				System.out.println();
				break;
			case 6:
				Set<Employee> ts = new TreeSet<>();
				ts = es.sortByName();
				ts.forEach(a -> {
					System.out.println(a);
				});
				break;
			case 9:
				sc.close();
				System.out.println("Thank you for visiting ....");
				break;
			default:
				System.out.println("wrong choice");

			}

		} while (choice != 9);
	}

}
