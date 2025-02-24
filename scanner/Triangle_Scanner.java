package scanner;

import java.util.Scanner;

public class Triangle_Scanner {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the dimensions of a Triangle: ");
		
		int b = s1.nextInt();
		int h = s1.nextInt();
		double Area_of_Triangle=0.5*b*h;
		System.out.println("Area_of_Triangle:- "+Area_of_Triangle);
		
		double p = s1.nextDouble();
		double q = s1.nextDouble();
		double r = s1.nextDouble();
		double Cicumference_of_Triangle=p+q+r;
		System.out.println("Cicumference_of_Triangle:- "+Cicumference_of_Triangle);
		s1.close();
	}

}
