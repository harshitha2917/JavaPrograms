package string_functions;

public class StringClass4 {
public static void main(String[] args) {
	//charAt(index)
	String a="automation";
	char c1=a.charAt(4);
	System.out.println(c1);//m
	
	//substring(index)-remove start index
	String b="Bala Krishna";
	System.out.println(b.substring(5));//Krishna
	
	//substring(start index,end index)-print only specified index
	System.out.println(b.substring(0, 4));//Bala

	//trim- it'll to remove extra spaces
	String t="       Automation     ";
	System.out.println(t);
	System.out.println(t.trim());
}
}