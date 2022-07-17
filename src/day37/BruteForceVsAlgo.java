package day37;

public class BruteForceVsAlgo {

	// min/max
	// Brute force
	public static int max(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];

			boolean isMax = true;

			for (int j = 0; j < arr.length; j++) {
				if (max < arr[j]) {
					isMax = false;
				}
			}

			if (isMax) {
				return max;
			}
		}

		return 0;
	}

	// Assumption Algo
	public static int maxTwo(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (max < num) {
				max = num;
			}
		}
		return max;
	}
}
