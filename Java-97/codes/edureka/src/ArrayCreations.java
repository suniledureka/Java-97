import java.util.Arrays;

public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 97;
		marks[1] = 89;
		System.out.println("size of array = " + marks.length);
		System.out.println(marks); //toString()
		System.out.println(Arrays.toString(marks));
		
		double []salaries = new double[9];
		System.out.println(Arrays.toString(salaries));
		
		boolean status[] = new boolean[10];
		System.out.println(Arrays.toString(status));
		
		for(boolean stat : status) {
			System.out.print(stat+", ");
		}
		System.out.println();
		
		String[] names = new String[10];
		System.out.println(Arrays.toString(names));
		
		char[] characters = new char[10];
		System.out.println(Arrays.toString(characters));
	}
}
