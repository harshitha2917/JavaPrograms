package typecasting;

public class Widening {
public static void main(String[] args) {
	//int into double
	//1st way
	int wt=67;
	double d1=wt;//implicit way
	System.out.println(d1);//widening can be done in both implicit and explicit manner 

	
	//2nd way
	double d2=(double)wt;
	System.out.println(d2);//explicit way
	
	//double-can accepts upto 17 to 19 decimal values
	//float-can accepts upto 4-6 decimal values
	//float into double - if we ned more number of decimal values we goto float to double

	float f=233.432f;
	double d3=f;
	System.out.println(d3);
	
	//short into int
	short s=3276;
	int a=(int)s;
	System.out.println(a);
	
}
}
