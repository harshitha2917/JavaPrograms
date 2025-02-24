package string_functions;

public class Palindrome {
	public static void main(String[] args)
	{
		
		String input="rotator";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--) 
		{
			char c=input.charAt(i);
			output=output+c;
		}
		System.out.println("The input of a String is -> "+input);
		System.out.println("The output of a String is -> "+output);
	
		if(input.equals(output)) {
			System.out.println("String is a palindrome");
		}
		else
			System.out.println("String is not a palindrome");
	}
}
