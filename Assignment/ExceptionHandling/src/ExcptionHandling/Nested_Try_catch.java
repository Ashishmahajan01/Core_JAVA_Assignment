package ExcptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested_Try_catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number:");
			try {
				System.out.println("Inside Nested try:");
				int v = sc.nextInt();
			} catch (InputMismatchException e) {
				throw new InputMismatchException("Ashish");
			} 
		} catch (Exception e) {
			System.out.println("Outside exception " + e.getMessage());
		} finally {
			System.out.println("Outside finally");
		}

	}

}
