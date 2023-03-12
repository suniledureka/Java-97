package co.edureka;

public class WrapperTest1 {

	public static void main(String[] args) {
		int n1 = 26;
		Integer n2 = n1; //auto-boxing
		int n3 = n2; //auto-unboxing
		System.out.println(n1 + " | " + n2 + " | " + n3);
	}
}
