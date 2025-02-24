package exception_handling;

import java.net.MalformedURLException;
import java.net.URL;

public class Thread_Program {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	System.out.println("First Line");
	Thread.sleep(2000);
	System.out.println("First Line");
	
	URL u1=new URL("https://www.amazon.in");
}
}
