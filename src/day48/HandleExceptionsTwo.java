package day48;

public class HandleExceptionsTwo {
	public static void main(String[] args) {
		System.out.println(reverse("hello"));
		System.out.println(reverse("apple"));
		System.out.println(reverse("abc"));
		System.out.println(reverse(null));
		System.out.println(reverse("john doe"));
	}
	
	public static String reverse(String str) {
		// TODO handle null pointer exception using try catch
		//      and return "" string when str is null
		StringBuilder sb = new StringBuilder();
	
		try {		
			for (int i = str.length() - 1; i >= 0; i--) {
				sb.append(str.charAt(i));
			}
		} catch(NullPointerException e) {
			return "";
		}

		return sb.toString();
	}
	
}
