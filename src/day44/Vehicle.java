package day44;

public class Vehicle {
	public String name = "Vehicle";
	public double price;
	
	public Vehicle(String name, double price) {
		System.out.println("In the parent Vehicle class two arg constructor");
		this.name = name;
		this.price = price;
	}
}
