package day7;

public class ConvertStrToNumerics {
	public static void main(String[] args) {
		String strNum = "255";
		// + is used for concatenation as well
		//     =  "25510"
		// strNum = strNum + 10;
		System.out.println(strNum); // 25510
		
		int num = Integer.parseInt(strNum);
		//  = 255 + 10
		num = num + 10;
		System.out.println(num); // 265
		
		String strNum2 = "99.99";
		// num = Integer.parseInt(strNum2); NumberFormatException
		double dNum = Double.parseDouble(strNum2);
		System.out.println(dNum);
		
		// byte, short, int, long, float, double
		byte bNum = Byte.parseByte("15");
		System.out.println(bNum);
		
		short shNum = Short.parseShort("500");
		System.out.println(shNum);
		
		int intNum = Integer.parseInt("1000");
		System.out.println(intNum);
		
		long longNum = Long.parseLong("999999");
		System.out.println(longNum);
		
		float fNum = Float.parseFloat("10.5");
		System.out.println(fNum);
		
		double doubleNum = Double.parseDouble("15.2");
		System.out.println(doubleNum);
	}
}
