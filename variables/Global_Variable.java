package variables;

public class Global_Variable {
	static double pi=3.14;//Static Global Variable
	int noofdaysinmonth_12=31;//Non-Static Global Variable
	static void area() {
		double a=pi*5*5;
		System.out.println(a);
	}
public static void main(String[] args) {
	//pi=5;//updatig the value
	area();
	double c=2*pi*5;
	System.out.println(c);//calling static global variable
	
	Global_Variable g1=new Global_Variable();//calling non-static global variable
	//System.out.println(g1.noofdaysinmonth_12);
	System.out.println(g1.noofdaysinmonth_12=30);//updating the value
	
}
}
