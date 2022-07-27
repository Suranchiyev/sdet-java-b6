package day41;

public class Superhero {
	public String name;
	public int powerLevel;
	
	// TODO define all the constructor to make 
	//      SuperheroDemo works correctly
	//      In total 4 constructors 
	
	public Superhero() {}
	
	public Superhero(String name) {
		this.name = name;
	}
	
	public Superhero(int powerLevel) {
		this.powerLevel = powerLevel;
	}
	
	public Superhero(String name, int powerLevel) {
		this.name = name;
		this.powerLevel = powerLevel;
	}
	
	public String getSuperheroDetails() {
		return "name = " + name + ", powerLevel = " + powerLevel;
	}
}
