package methods;

public class Method_Overloadig {
	static void add() {
		System.out.println("add 1");
	}
	static void add(int a) {
		System.out.println("add 2");
	}
public static void main(String[] args) {
	add();
	add(90);
}
}
