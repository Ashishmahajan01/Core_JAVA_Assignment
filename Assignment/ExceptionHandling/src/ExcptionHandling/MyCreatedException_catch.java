package ExcptionHandling;

import java.util.Scanner;

public class MyCreatedException_catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("In try:\nEnter:  ");
			
			int a = sc.nextInt();
			throw new MyCreatedError("Ashish");
//			if(a==10) {
//				throw new MyCreatedError("Ashish");
//			}
//			else {
//				throw new MyCreatedError("Ashish");
//			}
			//
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
