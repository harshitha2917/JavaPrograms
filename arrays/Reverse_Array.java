package arrays;

//Assignment-29
//WAP on Array of size 4 belongs to int type and copy its value into new arrayin reverse order?
import java.util.Arrays;

public class Reverse_Array {
	public static void main(String[] args) {
		// one array
		int rollno[] = new int[3];
		rollno[0] = 32;
		rollno[1] = 42;
		rollno[2] = 56;

		// another array
		int reverse[] = new int[3];

		for (int i = 0, j = 2; i <= 2; i++, j--) {
			reverse[j] = rollno[i];

		}
		System.out.println("Given Array-> " + Arrays.toString(rollno));
		System.out.println("Reversed Array-> " + Arrays.toString(reverse));

	}

}
