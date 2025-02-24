package loop;
//switch case program
import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		System.out.println("Press 1 to Chrome");
		System.out.println("Press 2 to Safari");
		System.out.println("Press 3 to Edge");
		System.out.println("Press 4 to Firefox");
		System.out.println("Press 5 to IE");
		System.out.println("Enter your selection");
		
		Scanner s1=new Scanner(System.in);
		int selection=s1.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Chrome");
			break;
		case 2:
			System.out.println("Safari");
			break;
		case 3:
			System.out.println("Edge");
			break;
		case 4:
			System.out.println("Firefox");
			break;
		case 5:
			System.out.println("IE");
			break;
			default:
				System.out.println("sorry your selection is wrong");
		}
	}

}
