package access_specifiers1;
//1.3 What happens outside the package by becoming sub class?
// you have to import a class from other package
import access_specifiers.Class;//or
//import access_specifiers.*;
public class Class1 extends Class 
{
public static void main(String[] args) {
	Class.add();//public
	Class.mul();//protected
}
}
