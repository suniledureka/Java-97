
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {87,96,82,71,68,99,76};
		
		System.out.println("no of subjects = " + marks.length);
		System.out.println();
		
		/*--- array iteration using for loop ---*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-" + (i+1) + " = " + marks[i]);
		}
		System.out.println();
		
		System.out.print("marks obtained ----> ");
		/*--- array iteration using enhanced for loop/ for..each loop ---*/
		for(int mark : marks) {
			System.out.print(mark + " | ");
		}
		
		System.out.println();
		System.out.println(marks[7]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
