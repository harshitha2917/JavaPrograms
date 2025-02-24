package arrays;
//Assignment-31,32,33,34
//WAP to count the number of numeric values present in the String
//WAP to count the number of alphabets present in the String
//WAP to count the number of spaces present in the String
//WAP to count the number of Special Chars present in the String
import java.util.Arrays;

public class Count_Array {
	public static void main(String[] args) {

		String name = "Manish 123 @#$%";
		// declaring and initializing
		int countofnumeric = 0;
		int countofalphabets = 0;
		int countofspace = 0;

		//convert name into character we use toCharArray
		char[] c1 = name.toCharArray();
		//to print 
		System.out.println(Arrays.toString(c1));

		for (int i = 0; i < c1.length; i++) 
		{
			//Character class can be used on char datatype
			boolean b1 = Character.isDigit(c1[i]);
			boolean b2 = Character.isAlphabetic(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);

			if (b1==true) {
				//increment the value of countofnumeric
				countofnumeric++;
			}
			if (b2 == true) {
				countofalphabets++;
			}
			if (b3 == true) {
				countofspace++;
			}
		}
		System.out.println("Length of the given String is-> " + name.length());
		System.out.println("Count of numeric-> " + countofnumeric);
		System.out.println("Count of alphabets-> " + countofalphabets);
		System.out.println("Count of space-> " + countofspace);
 
		//To find specialcharacters
		int countofspecialchar = name.length() - (countofnumeric + countofalphabets + countofspace);
		System.out.println("Count of special characters-> " + countofspecialchar);
	}

}
