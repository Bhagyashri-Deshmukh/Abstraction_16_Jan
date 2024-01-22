package abs;

public class Suzuki extends Car implements Speed, GearType {

	private int speed;
	private String gearType;

	public Suzuki(String company, String colour, int speed, String gearType) {
		super(company, colour);
		this.speed = speed;
		this.gearType = gearType;
	}

	@Override
	public void autoOrManual() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speedLimit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printCarInfo() {
		// TODO Auto-generated method stub

	}

}
