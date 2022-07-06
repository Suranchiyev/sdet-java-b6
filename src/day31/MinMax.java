package day31;

public class MinMax {
	public static void main(String[] args) {
		System.out.println(min(new int[] {7, 5, 4, 3, 1, 9, 2})); // 1
		System.out.println(max(new int[] {0, 7, 5, 4, 3, 1, 9, 2})); // 9
	}
	
	/*
	 * return the smallest number
	 */
	public static int min(int[] nums) {
		// assume first element is the smallest value in the array
		int minValue = nums[0];
		
		// check assumption by looping over the nums array
		for (int i = 1; i < nums.length; i++) {
			if (minValue > nums[i]) { 
				minValue = nums[i];
			}
		}
		return minValue;
	}
	
	public static int max(int[] nums) {
		int maxValue = nums[0];
		for (int num : nums) {
			if (maxValue < num) {
				maxValue = num;
			}
		}
		return maxValue;
	}
}
