package inheritance;
//1.Single Level Inheritance-calling static and non-static methods
class P_Class{
	static void login() {
		System.out.println("Login to amazon");
		
	}
	 void logout() {
		System.out.println("Logout to amazon");
	}
}
public class Google_1 extends P_Class //creating a relation
{
	static void testcase1() {
		System.out.println("Test Case 1 is searching a product");
	}
public static void main(String[] args) {
	
	login();//calling parent class 
	testcase1();
	
	Google_1 g1=new Google_1();
	g1.logout();//calling non-static method
	
}
}
