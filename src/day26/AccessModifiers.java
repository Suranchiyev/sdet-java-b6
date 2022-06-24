package day26;

/*
 * we can tag with access modifiers:
 * - classes, enums, interfaces
 * - instance and static variables
 * - instance and static methods
 * (local variables cannot have access modifiers)
 * 
 * By using access modifiers we can control the visibility of specific component(above)
 * Access Modifiers:
 * public                        -> accessible from anywhere.
 * protected                     -> accessible from the same package or subclass(inheritance).
 * default(no access modifier)   -> accessible from the same package only.
 * private                       -> accessible within the same class only.
 * 
 */
public class AccessModifiers {
	public String str;
	protected int num;
	double dNum;
	private String name;
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.str); 
		System.out.println(obj.num); 
		System.out.println(obj.dNum); 
		System.out.println(obj.name); 
	}
	
}
