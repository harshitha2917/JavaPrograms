package methods;

public class Mainmethod_Overloading {
	public static void main()//static
	{
	System.out.println("1");	
	}
	public  void main(int a)//non-static
	{
		System.out.println("2");
	}
public static void main(String[] args) {
	System.out.println("3");
	main();
	
	Mainmethod_Overloading m1=new Mainmethod_Overloading();
	m1.main(90);
	
}
}
