
public class RealTypes {

	public static void main(String[] args) {
		//float sal = 2750.5; //Type mismatch: cannot convert from double to float
		//float sal = 2750.5f;
		//float sal = 2750.5F;
		float sal = (float)2750.5;
		System.out.println("my salary = " + sal);
		
		//double data = 2750.5;
		double data = 2750.5d;
		System.out.println(data);
	}

}
