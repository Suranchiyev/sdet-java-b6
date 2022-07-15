package day36;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ClassScore {
	public static void main(String[] args) {
		List<Double> classScore = new ArrayList<>(Arrays.asList(89.9, 100.0, 78.1, 99.9, 65.6));
		System.out.println(classScore);
		
		double sum = 0.0;
		// TODO find out sum of classScore list
		
		//   score = 78.1 : [89.9, 100.0, 78.1, 99.9, 65.6]
		for (double score : classScore) {
			sum = sum + score;
			// sum += score;
		}
		
		System.out.println("Score class sum: " + sum);
		System.out.println("Average score: " + (sum / classScore.size()));
		
		System.out.println("-------");
		
		List<Integer> myNumbers = new ArrayList<>(Arrays.asList(5, 10, 24, 4, 12, 9, 11, 55));
		System.out.println(myNumbers); // [5, 10, 24, 4, 12, 9, 11, 55]
		// TODO find out the total sum of numbers that greater or equal than 10
		
		int numbersSum = 0;	
		for (int num : myNumbers) {
			if (num >= 10) {
				numbersSum += num;
			}
		}
		System.out.println("The numbers sum greater than 10: " + numbersSum);
		
		int nSum = 0;
		for (int i = 0; i < myNumbers.size(); i++) {
			if (myNumbers.get(i) >= 10) {
				nSum += myNumbers.get(i);
			}
		}
		System.out.println("The numbers sum greater than 10: " + nSum);
		
		int nSumTwo = 0;
		Iterator<Integer> iterator = myNumbers.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (num >= 10) {
				nSumTwo += num;
			}
		}
		System.out.println("The numbers sum greater than 10: " + nSumTwo);
		
		
	}
}
