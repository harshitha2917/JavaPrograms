package methods;

public class Static_NonStatic {
	static void add() {
		System.out.println("Addition");
	}
	static void sub() {
		System.out.println("Subtraction");
	}
	void mul() {
		System.out.println("Multiplication");
	}
	void div() {
		System.out.println("Division");
	}

public static void main(String[] args) {
	System.out.println("Main Method");
	//calling static method
	add();
	sub();
	//calling non-static method
	Static_NonStatic s1=new Static_NonStatic();
	s1.mul();
	s1.div();
}
}
