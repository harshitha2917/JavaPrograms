package scanner;

import java.util.Scanner;

public class Circle_Scanner {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the radius of a circle: ");
	double pi=3.14;
	int r=s1.nextInt();
	double Area_of_Cicle=pi*r*r;
	System.out.println("Area_of_Cicle:- "+Area_of_Cicle);
	
	double Cicumference_of_Cicle=2*pi*r;
	System.out.println("Cicumference_of_Cicle:- "+Cicumference_of_Cicle);
	s1.close();
}
}

