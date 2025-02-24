package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eh_Scanner {
public static void main(String[] args) {
	try
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Size of the array is:-> ");
	int Array[]=new int[s1.nextInt()];
	}
	catch(InputMismatchException i) {
		System.out.println("Handled the exeption,for nextInt method which was supposed to accept only int values");
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of the array as only int values:-> ");
		int Array[]=new int[s1.nextInt()];
	}
	catch(NegativeArraySizeException n) {
		System.out.println("Handled the exeption,for negative array values");
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of the array as only positive int values:-> ");
		int Array[]=new int[s1.nextInt()];
	}
	
}
}
//NegativeArraySizeException
//InputMismatchException