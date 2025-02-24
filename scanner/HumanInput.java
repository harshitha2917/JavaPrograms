package scanner;
import java.util.Scanner;
//Scanner Class - accept human input at run time
public class HumanInput {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Declare and Initialise all methods of scanner class");
	byte a=s1.nextByte();
	short b=s1.nextShort();
	int c=s1.nextInt();
	long d=s1.nextLong();
	float e= s1.nextFloat();
	double f=s1.nextDouble();
	boolean g=s1.nextBoolean();
	String h=s1.next();
	s1.close();
}
}
