package string_functions;

public class Reverse_String 
{
public static void main(String[] args)
{
	
	String input="Manish";
	String output="";
	
	for(int i=input.length()-1;i>=0;i--) 
	{
		char c=input.charAt(i);
		output=output+c;
	}
	System.out.println("The input of a String is -> "+input);

	System.out.println("The output of a String is -> "+output);
}
}

/*
 * i=6,c=h,o/p=h
 * i=5,c=s,o/p=h+s=hs
 * i=4,c=i,o/p=hs+i=hsi
 * i=5,c=n,o/p=hsi+n=hsin
 * i=5,c=a,o/p=hsin+a=hsina
 * i=5,c=m,o/p=hsnia+m=hsnia
 */
