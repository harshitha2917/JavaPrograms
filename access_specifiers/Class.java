package access_specifiers;
//1.3 What happens outside the package by becoming sub class?
public class Class {
	public static void add() {
		System.out.println("1");
	}
	static void sub() {
		System.out.println("2");
	}
	protected static void mul() {
		System.out.println("3");
	}
	private static void div() {
		System.out.println("4");
	}
	
}
