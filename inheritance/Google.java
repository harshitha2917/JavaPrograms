package inheritance;
//1.Single Level Inheritance
class Parent{
	static void login() {
		System.out.println("Login to amazon");
		
	}
	static void logout() {
		System.out.println("Logout to amazon");
	}
}
public class Google extends Parent //creating a relation
{
	static void testcase1() {
		System.out.println("Test Case 1 is searching a product");
	}
public static void main(String[] args) {
	login();//calling parent class
	testcase1();
	logout();
	
}
}
