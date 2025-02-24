package string_functions;

import java.util.Arrays;

public class Duplicate_String {
public static void main(String[] args) {
	String s="sschooll";
	
	char[] c1=s.toCharArray();
	Arrays.sort(c1);
	System.out.println(Arrays.toString(c1));
	
	int count=1;
	for(int i=0;i<=c1.length-1;i++)
	{
		if(c1[i]==c1[i+1]) 
		{
			count++;
		}
		else 
		{
			if(count>1){
				System.out.println(c1[i]+" has occured "+count+" times");
			}
			count=1;
		}
	}
	
}
}
