package string_functions;
//concatenation v/s append
//Mutable and Immutable
//Mutable-something can be changed
//Immutable-something can't be changed
public class StringClass2{
public static void main(String[] args) {
	String a="Automation";//you created a string
	System.out.println(a.concat(" Testing"));//you created another string
	System.out.println(a);//Immutable
	
	/*StringBuilder s1=new StringBuilder("Automation");
	System.out.println(s1.append(" Testing"));
	System.out.println(s1);//Mutable
	
	StringBuffer s2=new StringBuffer("Manual");
	System.out.println(s2.append(" Testing"));
	System.out.println(s2);//Mutable*/
}
}