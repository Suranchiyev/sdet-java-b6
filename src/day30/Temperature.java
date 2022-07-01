package day30;

public class Temperature {
	public static void main(String[] args) {
		double[] temp = {32.0, 30.5, 25.7, 26, 34, 31.5, 29.0};
		
		double sumTemp = 0.0;
		double averageTemp = 0.0;
		
		for (int i = 0; i < temp.length; i++) {
			sumTemp += temp[i];
		}
		
		System.out.println("The total sum is " + sumTemp);
		
		averageTemp = sumTemp / temp.length;
		System.out.println("The average temp is " + averageTemp);
		System.out.println("-------");
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] < averageTemp) {
				System.out.println(temp[i] + " below average temperature");
			} else if (temp[i] > averageTemp) {
				System.out.println(temp[i] + " above average temperature");
			} else {
				System.out.println(temp[i] + " average temperature");
			}
		}
		
	}
}





