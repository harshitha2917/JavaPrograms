package conditional_statements;

public class Nested_if_Else_Block {
public static void main(String[] args) {
	int a=10;
	int b=20;
	if(a<b)//true
		{
		if(a<8)//false
			{
			System.out.println("1");
		}
		else {
			System.out.println("2");
		}
	}
	else {
		System.out.println("3");
	}
}
}
