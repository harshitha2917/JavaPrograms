package inheritance;
//3.Multiple-level inheritance - Diamond Problem
//class Student1 //super class 1
interface Student1 //super class 1
{
	
}
interface Student2 //super class 1
//class Student2 //super class 2
{
	
}
//public class Mkt1 extends Student1,Student2
public class Mkt1 implements Student1,Student2

{
	public static void main(String[] args) {
		Mkt1 m1=new Mkt1();
	}
	
}
