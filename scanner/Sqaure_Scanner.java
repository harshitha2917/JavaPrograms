package scanner;

import java.util.Scanner;

public class Sqaure_Scanner {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the dimensions of a Square: ");
	int a=s1.nextInt();
	double Area_of_Square=a*a;
	System.out.println("Area_of_Square:- "+Area_of_Square);
	
	double Cicumference_of_Square=4*a;
	System.out.println("Cicumference_of_Square:- "+Cicumference_of_Square);
	s1.close();
}
}