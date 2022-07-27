package day41;

public class SuperheroDemo {
	public static void main(String[] args) {
		Superhero superHero = new Superhero();
		System.out.println(superHero.getSuperheroDetails()); // name = null, powerLevel = 0
		
		Superhero superHeroTwo = new Superhero("Chris");
		System.out.println(superHeroTwo.getSuperheroDetails()); // name = Chris, powerLevel = 0
		
		Superhero superHeroThree = new Superhero(5);
		System.out.println(superHeroThree.getSuperheroDetails()); // name = null, powerLevel = 5
		
		Superhero superHeroFour = new Superhero("Chris", 10);
		System.out.println(superHeroFour.getSuperheroDetails()); // name = Chris, powerLevel = 10
	}
}
