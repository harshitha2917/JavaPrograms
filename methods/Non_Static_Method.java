package methods;

public class Non_Static_Method {
	void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void sub() {
		int a=10;
		int b=20;
		System.out.println(b-a);
	}
public static void main(String[] args) {
	System.out.println("Main Method");
	Non_Static_Method n1=new Non_Static_Method();
	n1.add();//calling non-static method
	n1.sub();
}
}
