package automobile;

import automobile.Car.CarType;

public class SCross extends Car {

	private int noSeats, noAirbags;
	private String model, color;
	

	public SCross()
	{
		super(2022, "v5", CarType.SUV);
		
		this.noAirbags = 2;
		this.noSeats = 5;
		this.model = "diesel";
		this.color = "black";
	}
	
	public SCross(int yearOfMake, String engineNumber, int noSeats, int noAirbags, String model, String color) {
		super(yearOfMake, engineNumber, CarType.SUV);
		this.noSeats = noSeats;
		this.noAirbags = noAirbags;
		this.model = model;
		this.color = color;
		
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

	@Override
	public void maintenance() {
		System.out.println("Maruti SCross is under maintenace");
	}

}
