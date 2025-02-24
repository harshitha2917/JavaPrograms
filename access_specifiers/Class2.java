package access_specifiers;
//1.2 What happens within package?
public class Class2 {
public static void main(String[] args) {
	Class1.add();//public
	Class1.sub();//package or default
	Class1.mul();//protected
	//cannot access private	member
}
}
