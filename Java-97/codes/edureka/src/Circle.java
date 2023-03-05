
public class Circle extends Shape {
	float radius;
	
	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("area of \"circle\" = " + (Math.PI * radius * radius));
	}

}
