package test;

import java.util.Scanner;

import automobile.Car;
import automobile.SCross;
import automobile.Swift;
import automobile.XUV;
import birds.Bird;
import birds.BirdAbstract;
import birds.Duck;
import birds.ParrotMod;

public class Runner 
{
	public static void printSwiftInfo(Swift swift)
	{
		System.out.println("Swift");
		System.out.println("Year: " + swift.getYearOfMake());
		System.out.println("Engine: " + swift.getEngineNumber());
		System.out.println("Airbags: " + swift.getNoAirbags());
		System.out.println("Seats: " + swift.getNoSeats());
		System.out.println("Model: " + swift.getModel());
		System.out.println("Color: " + swift.getColor());
		
	}
	
	public static void printCarInfo(Car car)
	{
		System.out.println(car.getClass());
		System.out.println("Year: " + car.getYearOfMake());
		System.out.println("Engine: " + car.getEngineNumber());
		
		if(car instanceof automobile.Swift)
		{
			Swift swift = (Swift)car;
			System.out.println("Airbags: " + swift.getNoAirbags());
			System.out.println("Seats: " + swift.getNoSeats());
			System.out.println("Model: " + swift.getModel());
			System.out.println("Color: " + swift.getColor());
		}
		else if(car instanceof automobile.SCross)
		{
			SCross sx = (SCross)car;
			System.out.println("Airbags: " + sx.getNoAirbags());
			System.out.println("Seats: " + sx.getNoSeats());
			System.out.println("Model: " + sx.getModel());
			System.out.println("Color: " + sx.getColor());
		}

		else if(car instanceof XUV)
		{
			XUV xuv = (XUV)car;
			System.out.println("Airbags: " + xuv.getNoAirbags());
			System.out.println("Seats: " + xuv.getNoSeats());
			System.out.println("Model: " + xuv.getModel());
			System.out.println("Color: " + xuv.getColor());
		}
		
		
	}
	
	public static void findCarType(Car car)
	{
		if(car.getClass() == automobile.SCross.class){
			System.out.println("SUV: " + car.getType());
		}
		else if(car.getClass() == automobile.Swift.class){
			System.out.println("Hatchback: " + car.getType());
		}
		else if(car.getClass() == automobile.XUV.class){
			System.out.println("SUV: " + car.getType());
		}
		else
		{
			System.out.println("Car type unknown");
		}
		
	}
	
	public static void main(String[] args)
	{
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			int choice = scan.nextInt();
			
			switch(choice)
			{
				case -1: {
					loop = false;
					break;
				}
				case 1: {
					Swift swift = new Swift();
					swift.setColor("black");
					swift.setYearOfMake(2017);
					printSwiftInfo(swift);
					break;
				}
				case 2: {
					SCross sx = new SCross(2020, "v6", 7, 2,"petrol", "blue");
					sx.setNoSeats(6);
					sx.setColor("white");
					printCarInfo(sx);
					break;
				}
				case 3:
				{
					Swift swift = new Swift();
					printCarInfo(swift);
					
					SCross sx = new SCross();
					printCarInfo(sx);
					break;
				}
				case 4:
				{
					XUV xuv = new XUV(2022, "v8", "diesel", "white");
					findCarType(xuv);
					break;
				}
				
				case 5:
				{
					SCross sx = new SCross();
					sx.maintenance();
					
					Car c = new SCross();
					c.maintenance();
					
					c = new Car();
					c.maintenance();
					
					Swift swift = new Swift();
					swift.maintenance();
					
					break;
				}
				
				case 6:
				{
					XUV xuv1 = new XUV();
//					XUV xuv2 = new XUV(2022, "v8", "diesel", "white");
					break;
				}
				
				case 7: 
				{
//					BirdAbstract birdAbs = new BirdAbstract();
					BirdAbstract birdAbs1 = new ParrotMod();
					birdAbs1.fly();
					birdAbs1.speak();
					break;
				}
				case 8: {
					Duck duck = new Duck();
					duck.speak();
					duck.fly();
					break;
				}
			}
		}
	}

}
