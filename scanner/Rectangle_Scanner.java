package scanner;

import java.util.Scanner;

public class Rectangle_Scanner {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the dimensions of a Rectangle: ");
	int a = s1.nextInt();
	int b = s1.nextInt();

	double Area_of_Rectangle=a*b;
	System.out.println("Area_of_Rectangle:- "+Area_of_Rectangle);
	
	double Cicumference_of_Rectangle=2*(a+b);
	System.out.println("Cicumference_of_Rectangle:- "+Cicumference_of_Rectangle);
	s1.close();
}
}
