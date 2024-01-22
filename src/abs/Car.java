package abs;

public abstract class Car {

	private String company;
	private String colour;

	public Car(String company, String colour) {
		super();
		this.company = company;
		this.colour = colour;
	}
	
	public abstract void printCarInfo();
	
	public String retriveColour() {
		return colour;
	}
	
	public String retriveCompany() {
		return company;
	}

}
