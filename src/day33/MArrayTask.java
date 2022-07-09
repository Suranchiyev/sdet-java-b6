package day33;

public class MArrayTask {
	public static void main(String[] args) {
		int[][] numbers = 
			{
					{1532, 1113, 1124, 1134, 1145},
					{1158, 1191, 1208, 1225, 1242},
					{1216, 1174, 1191, 1208, 1225},
					{1276, 1262, 1286, 1311, 1335},
					{1340, 1338, 1370, 1403, 1436},
					{4322, 342}
			};
		
		// TODO
		// Find sum of each row(inner arrays) and print them
		for (int[] numberInnerArray : numbers ) {
			int innerArrSum = 0;
			for (int num : numberInnerArray) {
				innerArrSum += num;
			}
			System.out.println(innerArrSum);
		}
		System.out.println("--------------");
	
		// TODO
		// Find sum of whole array and print it
		// We need to get each elements value and sum them up
		// We need to use two loops to iterate over our two dim array
		
		int totalSum = 0;
		for (int[] numArr : numbers) {
			for (int num : numArr) {
				totalSum += num;
			}
		}
		System.out.println("Total sum: " + totalSum);
		System.out.println("--------------");
		
		// TODO 
		// Find average value of whole table(array) and print it
		// Find the length(number of elements) of whole array
		// Find the sum  
		// sum / numberOfElements => 
		
		int totalSumTwo = 0;
		int numberOfElements = 0;
		
		for (int[] numArr : numbers) {
			numberOfElements += numArr.length;
			
			for (int num : numArr) {
				totalSumTwo += num;
			}
		}
		
		int average = totalSumTwo / numberOfElements;
		System.out.println("Average value: " + average);
		System.out.println("--------------");
		
		// TODO
		// Find greatest value from whole table(array) and print it
		// By using assumption algorithm
		
		int max = numbers[0][0];
		
		for (int[] numArr : numbers) {
			for (int num : numArr) {
				if (max < num) {
					max = num;
				}
			}
		}
		
		System.out.println("The max value: " + max);
		
	}
}
