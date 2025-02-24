package exception_handling;

public class Ex_Handle {
public static void main(String[] args) {
	try {
		int a=1/0;
		//int a=1/1;
		System.out.println(a);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception Handled");
	}
	finally {
		System.out.println("It will exceute always");
	}
}
}
//can this 1 come from grand parent->possible
//can this 0 come from parent->possible