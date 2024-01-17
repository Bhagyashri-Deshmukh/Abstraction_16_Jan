package abstraction;

public class AbstractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Circle("Circle","Red",5);
		shape.area();
		
		Rectangle rectangle = new Rectangle();
		rectangle.area();
		
		Rectangle rectangleOne = new Rectangle("Pink","Rectangle",5,6);
		rectangleOne.area();
	}

}
