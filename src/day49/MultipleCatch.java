package day49;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			String str = null;
			// System.out.println(str.toLowerCase());
			System.out.println(12 / 0);
			// more code...
		
			// we can catch multiple exceptions
			// the smaller(inheritance) exceptions should be above bigger(inheritance) exceptions
		} catch(NullPointerException e) {
			System.out.println("NullPointerException is handled");
			
		} catch (RuntimeException e) {
			System.out.println("Runtime exception");
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
	}
}
