package methods;

public class Static_Method {
	static void Testcase_1()//login
	{
		System.out.println("Here i am going to do login");
	}
	static void Testcase_2()//Search the product
	{
		System.out.println("Here i am going to do login and search a product");
	}
public static void main(String[] args) {
	System.out.println("Launch");
	Testcase_1();//calling a static method inside a main method
	Testcase_2();
}
}
