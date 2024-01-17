package abstraction;

public class Rectangle implements Shape {

	private String shapeColour;
	private String shapeName;
	private int length;
	private int width;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String shapeColour, String shapeName, int length, int width) {
		super();
		this.shapeColour = shapeColour;
		this.shapeName = shapeName;
		this.length = length;
		this.width = width;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is : "+length*width);
	}
	
}
