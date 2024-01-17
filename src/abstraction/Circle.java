package abstraction;

public class Circle implements Shape {

	private String shapeName;
	private String shapeColour;
	private double radius;
	
	public Circle(String shapeName, String shapeColour, double radius) {
		super();
		this.shapeName = shapeName;
		this.shapeColour = shapeColour;
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is : "+3.14*radius*radius);
	}

}
