package day34;

public class VarargsTask {
	public static void main(String[] args) {
		int res = min(1, 2);
		System.out.println(res); // 1
		
		res = min(4, 6, 7, 0, 1, 3, -5, 2); // -5
		System.out.println(res);
		
		int[] inputArray = {3, 2, 1, 4, 0, 7, 8};
		res = min(inputArray);
		System.out.println(res); // 0
	}
	
	
	public static int min(int... nums) {
		int min = nums[0];
		for (int num : nums) {
			if (min > num) {
				min = num;
			}
		}
		return min;
	}
}
