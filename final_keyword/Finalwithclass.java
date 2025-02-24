package final_keyword;
//final
class Amz_Login{
	void auth() {
		System.out.println("Login with Email id");
	}
}
public class Finalwithclass extends Amz_Login{
void Mobile_No() {
	System.out.println("Login with mobile no");
}
public static void main(String[] args) {
	Finalwithclass f1=new Finalwithclass();
	f1.auth();
}
}
