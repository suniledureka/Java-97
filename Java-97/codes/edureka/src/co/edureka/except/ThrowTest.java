package co.edureka.except;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num = sc.nextInt();
		try {
			boolean result = checkEven(num);
			if (result)
				System.out.println(num + " is EVEN");
			else
				System.out.println(num + " is ODD");
		} catch (Exception ex) {
			System.out.println(ex);			
		}
	}

	private static boolean checkEven(int num) {
		if (num < 1)
			//throw new RuntimeException();
			throw new RuntimeException(num + " is not a positive number");

		return num % 2 == 0 ? true : false;
	}

}
