package loop;

/* Assignment-39-WAP to implement while loop
  * will peddle 50 times to reach office-How many times? here you know the iteration count
I will keep peddling untill I reach office-Here we dont know the times? here you dont know the iteration count
for Loop-When we know the number of iteration
while Loop-When we dont know the number of iteration
Syntax-
declaration and initialization;
while() {
	logic;
	increment/decrement;
}*/
public class WhileLoop {
	public static void main(String[] args) {
		int i =10;
		while (i<50)//true
			{
			System.out.println(i);
			i++;
		}
	}
}
