
public class StaticTest {
	
	static{
		System.out.println("inside static method");
	}
	
	public static void main(String[] args) {
		System.out.println("in main method");
	}

	static{
		System.out.println("static static block-2");
	}	
}
