package day29;

public class Price {
	public static void main(String[] args) {
		double[] price = new double[3];
		price[0] = 14.99;
		price[1] = 9.99;
		price[2] = 1.5;
		
		//    0      1    2
		// [14.99, 9.99, 1.5]
		//                  14.99  +   9.99   + 1.5
		double priceSum = price[0] + price[1] + price[2];
		System.out.println("Price sum: " + priceSum);
		
		double averagePrice = priceSum / 3;
		System.out.println("Average price: " + averagePrice);
	}
}
