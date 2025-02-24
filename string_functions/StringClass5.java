package string_functions;

public class StringClass5 {
public static void main(String[] args) 
{
	//equals
	String a="Manish";
	boolean answer=a.equals("Abhishek");
	System.out.println(answer);
	
	//contains
	String name="automation testing";
	boolean b=name.contains("testing");
	System.out.println(b);
	
	//equalsIgnorecase
	boolean b1=a.equalsIgnoreCase("manish");
	System.out.println(b1);
	
	
}
}
