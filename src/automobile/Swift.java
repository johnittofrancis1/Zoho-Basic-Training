package automobile;

import automobile.Car.CarType;

public class Swift extends Car {

	private int noSeats, noAirbags;
	private String model, color;
	
	public Swift()
	{
		super(2022, "v5", CarType.HATCHBACK);
		
		this.noAirbags = 2;
		this.noSeats = 5;
		this.model = "petrol";
		this.color = "white";
	}
	
	public Swift(int yearOfMake, String engineNumber, int noSeats, int noAirbags, String model, String color) {
		super(yearOfMake, engineNumber, CarType.HATCHBACK);
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

}
