package automobile;

import automobile.Car.CarType;

public class XUV extends Car {

	private int noSeats, noAirbags;
	private String model, color;
	
	public XUV(int yearOfMake, String engineNumber, String model, String color) {
		super(yearOfMake, engineNumber, CarType.SUV);
		this.noSeats = 7;
		this.noAirbags = 3;
		this.model = model;
		this.color = color;
		
	}
	
	public XUV()
	{
		super("Checking from XUV");
	}

	public int getNoSeats() {
		return noSeats;
	}

	public void setNoSeats(int noSeats) {
		this.noSeats = noSeats;
	}

	public int getNoAirbags() {
		return noAirbags;
	}

	public void setNoAirbags(int noAirbags) {
		this.noAirbags = noAirbags;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
