package day5;

public class Swap {
	public static void main(String[] args) {
		//    apple 
		String box = "apple";
		//    apple     
		String box1 = box;
		
		System.out.println(box); // apple
		System.out.println(box1); // apple
		
		//  = apple
		box = box1;
		System.out.println(box); // apple
		System.out.println(box1); // apple
		System.out.println("---------");
		
		String sky = "yellow";
		String sun = "blue";
		// TODO swap values of sky and sun without directly assigning the value

		String tmp = sky;	
		sky = sun;
		sun = tmp;
		
		System.out.println("sky is " + sky);
		System.out.println("sun is " + sun);
	}
}
