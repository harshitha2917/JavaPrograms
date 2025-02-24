package scanner;

import java.util.Scanner;

public class AddingusingScanner {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter value a:- ");
	int a=s1.nextInt();
	
	System.out.println("Enter value b:- ");
	int b=s1.nextInt();
	
	int sum=a+b;
	System.out.println("Addition of two values are:- "+sum);
	
	s1.close();
}
}
