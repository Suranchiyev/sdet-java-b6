package day15;

public class WarmUp {
	public static void main(String[] args) {
		getNumStr(1); // One
		getNumStr(2); // Two
		getNumStr(3); // Three
		getNumStr(4); // Four
		getNumStr(5); // Five
		getNumStr(6); // Not supported
		getNumStr(0); // Not supported
	}
	
	public static void getNumStr(int num) {
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3: 
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Not supported");
		}
	}
}
