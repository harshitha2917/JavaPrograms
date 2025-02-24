package string;
/*Assignment-41 
 Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt, 
 * length, substring(int) & substring (start & end index) using StringBuilder concept*/
public class String_Builder {
public static void main(String[] args) {
	StringBuilder s1=new StringBuilder("Automation");
	s1.append(" Testing");//append
	System.out.println("Append-> "+s1);
	
	System.out.println("Delete-> "+s1.delete(0, 10));//delete
		
	StringBuilder s2=new StringBuilder("Manual");
	System.out.println("Insert-> "+s2.insert(6," Testing"));//insert
	
	System.out.println("Length-> "+s2.length());//length
	
	System.out.println("charAt-> "+s2.charAt(0));//charAt
	
	System.out.println("Replace-> "+s2.replace(0, 6, "API"));//replace
	
	System.out.println("reverse-> "+s2.reverse());//reverse
	
	StringBuilder s3=new StringBuilder("I am MKT");
	System.out.println("substring-> "+s3.substring(1));//substring
	System.out.println(s3.substring(5, 8));
	
	
}
}
