package methods;
//Method Overloading
public class MethodOverload {
	static void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	static void add(double a,int b) {
		double sum=a+b;
		System.out.println(sum);
	}
	static void add(double a,double b) {
		double sum=a+b;
		System.out.println(sum);
	}
	static void add(String s) {
	
		System.out.println("Software Testing");
	}
	void add(double b) {
		double sum=b+6;
		System.out.println(sum);
	}
public static void main(String[] args) {
	add(90,80);//calling static
	add(90.0,80);
	add(80.0,70.0);
	add("MKT");
	
	MethodOverload m1=new MethodOverload();
	m1.add(5);//calling non-static
	
}
}
