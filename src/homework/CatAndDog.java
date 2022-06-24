package homework;

public class CatAndDog {
	public static void main(String[] args) {
        boolean res = catDog("catdogabc");
        System.out.println(res);
	}
	
	public static boolean catDog(String str) {
		int catCount = 0;
		int dogCount = 0;
		// 012345678
		// catdogabc 
		
		for (int i = 0; i < str.length() - 2; i++) {
			char firstCh = str.charAt(i);
			char secondCh = str.charAt(i + 1);
			char thirdCh = str.charAt(i + 2);
			
			if (firstCh == 'c' && secondCh == 'a' && thirdCh == 't') {
				catCount++;
			}
			
			if (firstCh == 'd' && secondCh == 'o' && thirdCh == 'g') {
				dogCount++;
			}
		}
		
		return catCount == dogCount;
	}
}
