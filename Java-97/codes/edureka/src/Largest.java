
public class Largest {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		int lar;
		
		/*
		if(x > y) {
			lar = x;
		}
		else {
			lar = y;
		}
		*/
		
		lar = (x > y) ? x : y;
		
		System.out.println("largest of (" + x +", " + y + ") = " + lar);
	}

}
