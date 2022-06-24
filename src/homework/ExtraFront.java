package homework;

public class ExtraFront {
	public static void main(String[] args) {
		String res = extraFront("Hello");
 		System.out.println(res); // HeHeHe
	}

	public static String extraFront(String str) {
		// "Hello"
		
		String strH = "";
		//             0 < 3
		for(int i = 0; i < 3; i++) {
				
			if (str.length() < 2) {
				strH += str;
			} else {
				//     "He"
				strH += str.substring(0, 2);
			}
		}
		
		return strH;
	}
}
