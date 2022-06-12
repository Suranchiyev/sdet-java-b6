package day20;

public class EnumInJava {
	enum Country {
		USA, CANADA, UK, BRAZIL
	}
	
	public static void main(String[] args) {
		Country country = Country.CANADA;
		System.out.println(country);
		System.out.println("---------");
		
		double fee = getFeeByCountry(Country.USA);
		System.out.println(fee);
		
		fee = getFeeByCountry(Country.CANADA);
		System.out.println(fee);
		
		fee = getFeeByCountry(Country.BRAZIL);
		System.out.println(fee);
		
//		fee = getFeeByCountry(Country.KAZAKHSTAN); // it doesn't compile because enum doesn't have KAZAKHSTAN as its value
//		System.out.println(fee);
	}
	
	// USA
	// Canada
	// UK
	// Brazil
	public static double getFeeByCountry(Country country) {
		switch(country) {
		case USA:
			return 10.0;
		case CANADA:
			return 12.5;
		case UK:	
			return 9.5;
		case BRAZIL:
			return 9.0;	
		default:
			return 0.0;
		}
	}
}
