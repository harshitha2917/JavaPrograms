package string_functions;

public class StringClass6 {

public static void main(String[] args) {
	//replace charsequence
	String s1="Automation Testing";
	System.out.println(s1.replace("automation", "Manual"));
	
	//replace with char
	String s2="school"; 
	System.out.println(s2.replace('s', 'S'));
	
	//replaceAll String regex-all the capital letters gone
	String s3="Manish Kumar Tiwari";
	System.out.println(s3.replaceAll("[A-Z]", ""));
	
	String s4="kv no 2,bangalore karnataka India";
	System.out.println(s4.replaceAll("[0-9]",""));
	
	//In the given string remove space
	String s5="Harshitha A";
	System.out.println(s5.replaceAll(" ", ""));
}
}
