package day32;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arrNums = {6, 3, 2, 100, 0};
		int target = 2;
		
		for (int num : arrNums) {
			if (num == target) {
				System.out.println("Yes");
			}
		}
	}
}
