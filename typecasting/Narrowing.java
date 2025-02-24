package typecasting;

public class Narrowing {
	public static void main(String[] args) {
		// double into int

		double weight = 51.2;
		int new_weight = (int) weight;// narrowing can be done explicit manner only
		System.out.println(new_weight);

	}
}
