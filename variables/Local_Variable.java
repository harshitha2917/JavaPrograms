package variables;

public class Local_Variable {
void add() {
	int a=10;
	a=100;//updating the value of local variable
	int b=20;
	System.out.println(a+b);
}
void sub() {
	int a=10;
	int b=20;
	b=25;
	System.out.println(b-a);
}
void mul() {
	int a=10;
	int b=20;
	System.out.println(b*a);
}
public static void main(String[] args) {
	Local_Variable l1=new Local_Variable();
	l1.add();
	l1.sub();
}
}
