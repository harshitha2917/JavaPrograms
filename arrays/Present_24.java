package arrays;

//Assigment-36
//WAP to check if 24 is a part of your array if yes print its indexing
public class Present_24 {
	public static void main(String[] args) {
		int array[] = new int[4];
		array[0] = 55;
		array[1] = 24;
		array[2] = 45;
		array[3] = 60;

		int no_to_check = 24;
		for (int i = 0; i <= array.length-1; i++) {
			if (no_to_check == array[i]) {
				System.out.println("The number is present in the given array and the indexing is-> " + i);

			}
		}

	}
}