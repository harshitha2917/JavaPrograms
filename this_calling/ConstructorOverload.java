package this_calling;
//this calling statement
//Constructor Overloading
public class ConstructorOverload {
 
	ConstructorOverload(){
		this(900);
	System.out.println("Constructor Overloading 1");
    }
	ConstructorOverload(int a){
		System.out.println("Constructor Overloading 2");
	}
	ConstructorOverload(boolean b1,boolean b2,String s,char gender){
		System.out.println("Constructor Overloading 3");
	}
	public static void main(String[] args) {
		new ConstructorOverload();
		new ConstructorOverload(90);
		new ConstructorOverload(false,true,"MKT",'F');

		
	}
}
