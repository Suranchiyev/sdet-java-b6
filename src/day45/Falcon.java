package day45;

// when abstract class extends abstract class 
// it is not required to implement abstract methods
// the first non abstract concrete class must implement
// all abstract methods from both abstract classes
public abstract class Falcon extends Bird {
	public abstract void hunt();
}
