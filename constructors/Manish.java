package constructors;
//constructors-A special type of method which doesn't hav any return type

public class Manish {
	Manish(){
		System.out.println("This is my Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		new Manish();
		//or
		Manish m1=new Manish();
		
	}

}
