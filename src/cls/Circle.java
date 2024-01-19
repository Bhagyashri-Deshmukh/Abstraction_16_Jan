package cls;

public class Circle extends Shape {

	private double radius;

	public Circle(String colour, String shapeName) {
		super(colour, shapeName);
		// TODO Auto-generated constructor stub
	}

	public Circle(String colour, String shapeName, double radius) {
		super(colour, shapeName);
		this.radius = radius;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Shape is : " + super.retrieveShapeName() + " Colour is : " + super.retrieveColour());
		System.out.println("Radius of circle is : " + 3.14 * radius * radius);
	}

}
