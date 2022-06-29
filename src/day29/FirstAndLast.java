package day29;

public class FirstAndLast {
	public static void main(String[] args) {
		// .length instance variable of array to get the size of array.
		
		//     0         1        2         3          4
		// ["Vijay", "Ramesh", "Milena", "Sibrab", "Charllie"]
		String[] myTeam = {"Vijay", "Ramesh", "Milena", "Sibrab", "Charllie"};
		
		System.out.println(myTeam); // [Ljava.lang.String;@1dbd16a6
		System.out.println(myTeam[0]); // Vijay
		
		int size = myTeam.length;
		System.out.println("Array size: " + size);
		
		printFirstAndLast(myTeam);
		System.out.println("---------");
		
	}
	
	public static void printFirstAndLast(String[] arr) {
		System.out.println(arr[0]);
		int size = arr.length; 
		System.out.println(arr[size - 1]);
	}
}
