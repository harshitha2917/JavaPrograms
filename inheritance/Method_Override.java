package inheritance;
//Method Override with super keyword and final keyword
//final
class P1_Class{
	void login() {
		System.out.println("Login with email id");
	}
}

public class Method_Override extends P1_Class{
	void login() {
		super.login();//super keyword
		System.out.println("Login with mobile no");
		super.login();//calling super keyword 2nd time
	}
public static void main(String[] args) {
	Method_Override m1=new Method_Override();
		m1.login();
}
}
