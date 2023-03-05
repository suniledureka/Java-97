import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Shape sh = null;
		//sh = new Shape(); //Cannot instantiate the type Shape
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape do you want to work with?[1.Rect | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
		   sh = new Rectangle("blue", 12, 6);
		   break;
		 case 2:
		   sh = new Circle("yellow", 6.5f);
		   break;		   
		 default:
		   System.err.println("--- INVALID SHAPE SELECTION --- TRY AGAIN ---");
		   return;
		}
		
		System.out.println("\n=========================== SHAPE SELECTED: " + sh.getClass().getName().toUpperCase() + " ===========================");
		
		System.out.println("color of " + sh.getClass().getName()+ " = " + sh.getColor());
		sh.area();
	}
}
