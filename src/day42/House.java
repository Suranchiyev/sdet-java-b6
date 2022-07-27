package day42;

// TODO encapsulate this class
// 1. Make all instance variables private
// 2. Provide public getters and setters
public class House {
	private String type;
	private int numberOfRooms;
	private double price;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
