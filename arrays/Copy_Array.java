package arrays;

//Assignment-28
//WAP on Array of size 4 belongs to int type and copy its value into another array?
import java.util.Arrays;
import java.util.Scanner;

public class Copy_Array {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("You decide what size of array you need it?");

		int rollno[] = new int[s1.nextInt()];

		for (int i = 0; i <= rollno.length - 1; i++) {
			System.out.println("Enter the value of array at index-> " + i);
			rollno[i] = s1.nextInt();// printing
		}
		System.out.println("The given array is-> " + Arrays.toString(rollno));

		int rollno1[] = new int[rollno.length];
		for (int j = 0; j <= rollno1.length - 1; j++) {

			rollno1[j] = rollno[j];// copying one array into another array
		}
		System.out.println("Copied array is-> " + Arrays.toString(rollno1));
		s1.close();
	}
}
