package access_specifiers;
//1.How to use access-specifiers for method?
//1.1 What happens within the class?-we can access all AS
public class Addition {
	//public
	public static void add1() {
		
	}
	//default or package
	static void add2() {
		
	}
	//protected
	protected static void add3() {
		
	}
	//private
	private static void add4() {
		
	}
public static void main(String[] args) {
	add1();
	add2();
	add3();
	add4();
	
}
}
