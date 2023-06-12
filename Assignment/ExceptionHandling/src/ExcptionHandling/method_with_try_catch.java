package ExcptionHandling;

import java.util.InputMismatchException;

public class method_with_try_catch {
	public static void dataload() throws InputMismatchException {
		throw new InputMismatchException("Ashish");
	}

	public static void main(String[] args) {
		try {
			System.out.println("Hii");
			dataload();
		}
		catch(Exception e) {
			System.out.println("catch :" + e.getMessage());
		}


	}

}
