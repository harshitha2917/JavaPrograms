package string;
/*Assignment-40
 * Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt, length, 
substring(int) & substring (start & end index) using StringBuffer concept*/

public class String_Buffer {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("Automation");
	s1.append(" Testing");//append
	System.out.println("Append-> "+s1);
	
	System.out.println("Delete-> "+s1.delete(0, 10));//delete
		
	StringBuffer s2=new StringBuffer("Manual");
	System.out.println("Insert-> "+s2.insert(6," Testing"));//insert
	
	System.out.println("Length-> "+s2.length());//length
	
	System.out.println("charAt-> "+s2.charAt(0));//charAt
	
	System.out.println("Replace-> "+s2.replace(6, 14, " Tester"));//replace
	
	System.out.println("reverse-> "+s2.reverse());//reverse
	
	StringBuffer s3=new StringBuffer("I am MKT");
	System.out.println("substring-> "+s3.substring(1));//substring
	System.out.println(s3.substring(5, 8));
	
	

}
}
