package co.edureka.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try {
			System.out.print("enter first no: ");
			int fno = sc.nextInt();
			
			System.out.print("enter second no: ");
			int sno = sc.nextInt();
			
			int res = fno / sno;
			System.out.println("result = " + res);
		}catch(ArithmeticException ex) {
			System.out.println("catch block");			
		}finally {
			    System.out.println("\nfinally block");
				System.out.println("application designed & developed by");
				System.out.println("\tteam@edureka");
				sc.close();
		}
		
		System.out.println("----- done -----");
	}
}
