package co.edureka.except;

public class Except1 {

	public static void main(String[] args) {
		int x = 10;
		//int y = 5;
		int y = 0;
		int z = x / y; //java.lang.ArithmeticException
		System.out.println(x + " / " + y + " = " + z);
		System.out.println("----- done -----");
	}
}
