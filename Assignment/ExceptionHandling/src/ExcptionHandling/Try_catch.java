package ExcptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number:");
			int a = sc.nextInt();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block: ");
		}

	}

}
