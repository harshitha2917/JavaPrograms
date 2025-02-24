package super_calling;
//super calling statement used to call parent class constructor from the child class constructor 
class facebook_Class{
	facebook_Class(int a)
	{
		System.out.println("Facebook");
	}
}
class Google_Auth extends facebook_Class//parent constructor
{
	Google_Auth(){
		super(90);
		System.out.println("Google");
	}
}

public class Amazon  extends Google_Auth
{
	Amazon(){
		super();//super calling statement(Google_Auth)
		System.out.println("Amazon");
	}
public static void main(String[] args) {
	new Amazon();
}
}
