package day25;

public class Table {
	public String type;
	public String color;
	public boolean isReserved;
	
	// constructor is a special method that used
	// to create an object.
	// constructor name is the same as class name
	public Table(String type, String color, boolean isReserved) {
		this.type = type;
		this.color = color;
		this.isReserved = isReserved;
	}
	
	public Table() {
		
	}
	
	// if do not define any constructor java will provide
	// default empty constructor. If at least one constructor
	// is defined java will not provide empty constructor.
}
