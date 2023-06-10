package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static int divide(int i,int j) {
		try {
		int ans=i/j;
		return ans;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int k=0;k<3;k++) {
	try {
		  System.out.println("enetr a number i");
		  int i=sc.nextInt();
		  System.out.println("enetr a number j");
		  int j=sc.nextInt();
		  int ans=divide(i,j);
		  System.out.println(ans);
		  break;
		}catch(InputMismatchException|ArithmeticException e) {
			System.out.println(" pls enter number");
			System.out.println(e.getMessage());
			sc.next();
		}
		catch(Exception e) {
			System.out.println("error occured");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("in finally block");
		}
	}
	
	
	
	
	
	
	
	
	
}
}
