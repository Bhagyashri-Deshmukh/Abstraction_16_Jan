package cls;

abstract class Shape {

	private String colour;
	private String shapeName;	
	
	public Shape(String colour, String shapeName) {
		super();
		this.colour = colour;
		this.shapeName = shapeName;
	}
	
	abstract void area();
	
	public String retrieveColour() {
		return colour;
	}
	
	public String retrieveShapeName() {
		return shapeName;
	}
}
