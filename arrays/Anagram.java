package arrays;

import java.util.Arrays;
//Assignment-35
//top-pot,ram-arm,stop-spot,
//WAP to check if 2 given Strings are ANAGRAM
public class Anagram {
public static void main(String[] args) {
	String input1="silent";//eilnt
	String input2="listen";//eilnt
	if(input1.length()!=input2.length()) {
		System.out.println("They can never be anagram since the length of the strings aredifferent");
	}
	else
	{
		System.out.println("Let's find out now if it's anagram");
	}
	char c1[]=input1.toCharArray();
	char c2[]=input2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println("After sorting-> "+Arrays.toString(c1));
	System.out.println("After sorting-> "+Arrays.toString(c2));
	if (Arrays.equals(c1, c2)==true) {
		System.out.println("The given input is anagram");
	}
	else {
		System.out.println("the given input is not anagram");
	}

}
}
