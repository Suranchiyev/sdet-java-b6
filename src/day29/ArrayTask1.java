package day29;

public class ArrayTask1 {
	public static void main(String[] args) {
		int[] number = new int[3];
		
		//  0  1  2
		// [3, 5, 7]
		number[0] = 3;
		number[1] = 5;
		number[2] = 7;
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println("---------");
		
		double[] tmp = new double[6];
		tmp[0] = 1.1;
		tmp[1] = 1.2;
		tmp[2] = 6.6;
		tmp[3] = 4.3;
		tmp[4] = 0.5;
		tmp[5] = 7.7;
				
		System.out.println(tmp[0]);
		System.out.println(tmp[5]);
		System.out.println("---------");
		
		String[] team = new String[6];
		team[0] = "bugbusters";
		team[1] = "javangers";
		team[2] = "lemonade";
		team[3] = "loopmasters";
		team[4] = "ninjava";
		team[5] = "dreamteam";
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(team[i]);
		}
	}
}
