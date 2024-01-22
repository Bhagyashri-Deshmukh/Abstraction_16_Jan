package abs;

public class Zest extends Car implements Speed, GearType {

	private int speed;
	private String gearType;

	public Zest(String company, String colour, int speed, String gearType) {
		super(company, colour);
		this.speed = speed;
		this.gearType = gearType;
	}

	@Override
	public void speedLimit() {
		// TODO Auto-generated method stub
		System.out.println("Speed Limit is : "+speed);
	}

	@Override
	public void autoOrManual() {
		// TODO Auto-generated method stub
		System.out.println("Car gear type is : "+gearType);
	}

	@Override
	public void printCarInfo() {
		// TODO Auto-generated method stub
		System.out.println("Car colour is : "+super.retriveColour());
		System.out.println("Car colour is : "+super.retriveCompany());
		System.out.println("Car Speed limit is : "+speed);
		System.out.println("Car gear is : "+gearType);
	}

}
