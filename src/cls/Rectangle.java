package cls;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(String colour, String shapeName) {
		super(colour, shapeName);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String colour, String shapeName, int length, int width) {
		super(colour, shapeName);
		this.length = length;
		this.width = width;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Shape is : " + super.retrieveShapeName() + " Colour is : " + super.retrieveColour());
		System.out.println("Atrea of rectangle is : " + length * width);
	}

}
