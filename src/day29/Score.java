package day29;

public class Score {
	public static void main(String[] args) {
		// Array is fixed size collection of data of the same type.
		//  0   1   2   3   4
		// [70, 80, 90, 70, 60]
		
		// We always need to give a size while creating our array
		int[] score = new int[5];
		score[0] = 70;
		score[1] = 80;
		score[2] = 90;
		score[3] = 70;
		score[4] = 60;
		
		// exception here because we created array of size 5 
		// and we are trying to reach 6th element.
		// score[5] = 100;
		
		System.out.println(score[0]); // 70
		System.out.println(score[1]); // 80
		System.out.println(score[2]); // 90
		System.out.println(score[3]); // 70
		System.out.println(score[4]); // 60
		
		// Index out of bound exception
		// System.out.println(score[5]);
		
		//  0   1   2   3   4
		// [140, 80, 90, 70, 60]
		//  140  =       80 + 60
		score[0] = score[1] + score[4];
		System.out.println(score[0]); // 140
		
		System.out.println(score); // [I@1dbd16a6
	}
}
