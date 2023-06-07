package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Shape;
import com.demo.beans.Triangle;

public class ShapeService {
	private static Shape[] arr;
	private static int cnt;

	static {
		arr = new Shape[20];
		cnt = 0;
	}

	public static void addnewshape(int choice) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Colour:");
		String color = sc.next();

		switch (choice) {
		case 1:
			System.out.println("Enter Base:");
			int b = sc.nextInt();
			System.out.println("Ente Height:");
			int h = sc.nextInt();
			System.out.println("Enter Side 1:");
			int s1 = sc.nextInt();
			System.out.println("Enter Side 2:");
			int s2 = sc.nextInt();
			arr[cnt] = new Triangle(color, b, h, s1, s2);
			break;
		case 2:
			System.out.println("Enter Base:");
			b = sc.nextInt();
			System.out.println("Ente Height:");
			h = sc.nextInt();
			arr[cnt] = new Rectangle(color, b, h);
			break;
		case 3:
			System.out.println("Enter Base:");
			int r = sc.nextInt();
			arr[cnt]=new Circle(color,r);
			break;
		}
		cnt++;
	}
	
	public static void diplayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int  searchById(int id) {
		for(int i=0;i<cnt;i++) {
			if(arr[i].getId()==id) {
				System.out.println(arr[i]);
				return i;
			}
		}
		return -1;
	}
	
	public static String CalculateDetails(int id) {
		int pos=searchById(id);
		if(pos!=-1) {
			float area=arr[pos].calculateArea();
			float perimeter=arr[pos].calculatePerimeter();
			return area+","+perimeter;
		}else {
			return null;
		}
		
		
	}

	public static String calculateNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
