package arrays;
//Assignment-30
//WAP to accept the values of 2 arrays at run-time and compare if both are equal
import java.util.Arrays;

public class Equal_Array {
	public static void main(String[] args) {
		int array1[] = new int[4];
		int array2[] = new int[4];

		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;

		array2[0] = 10;
		array2[1] = 20;
		array2[2] = 30;
		array2[3] = 40;

		System.out.println("The first array is-> " +Arrays.toString(array1));
		System.out.println("The second array is-> " + Arrays.toString(array2));

		//boolean answer = Arrays.equals(array1, array2);
		//if(answer==true) or
		if (Arrays.equals(array1, array2)) 
		{
			System.out.println("Arrays are EQUAL");
		} 
		else 
		{
			System.out.println("Arrays are NOT EQUAL");
		}

	}
}
