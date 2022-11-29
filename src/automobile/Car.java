package automobile;

public class Car {
	
	public static enum CarType {
			HATCHBACK,
			SEDAN,
			SUV
	};
	
	private int yearOfMake;
	private String engineNumber;
	private CarType type;
	
	public Car()
	{
		this.yearOfMake = 2010;
		this.engineNumber = "v8";
		this.type = CarType.SEDAN;
	}
	
	public Car(int yearOfMake, String engineNumber, CarType type)
	{
		this.yearOfMake = yearOfMake;
		this.engineNumber = engineNumber;
		this.type = type;
	}
	
	public Car(String input)
	{
		System.out.println(input);
	}

	public int getYearOfMake() {
		return yearOfMake;
	}

	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public void maintenance()
	{
		System.out.println("Car under maintenance");
	}
}
