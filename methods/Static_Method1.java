package methods;

public class Static_Method1 {
	static void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void sub() {
		int a=10;
		int b=20;
		System.out.println(a-b);
	}
	static void mul() {
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	static void div() {
		int a=10;
		int b=20;
		System.out.println(b/a);
	}
public static void main(String[] args) {
	add();//calling muliple methods
	sub();
	mul();
	div();
}
}
