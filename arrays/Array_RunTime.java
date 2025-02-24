package arrays;
import java.util.Arrays;
//Assignment-27
//WAP of an arrayof size 4 belong to int type and accept its value at run time
import java.util.Scanner;

public class Array_RunTime {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("You decide what size of array you need it?" );
	
	//array syntax
	//datatype[] vaiable =new datatype[];
	int rollno[]=new int[s1.nextInt()];
	
	for (int i=0;i<=rollno.length-1;i++) 
	{
	System.out.println("Enter the value of array at index-> "+i);	
	rollno[i]=s1.nextInt();
	}
	System.out.println("The given array is "+Arrays.toString(rollno));
	s1.close();
}
}
