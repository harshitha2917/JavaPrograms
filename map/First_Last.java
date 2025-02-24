package map;
//Assignment-44
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class First_Last {
public static void main(String[] args) {
	Map<String,String> m3=new HashMap<String,String>();
	m3.put("Manish", "Tiwari");
	m3.put("Akash", "Kumar");
	m3.put("Anjan", "Reddy");
	m3.put("Ravi", "Rao");
	m3.replace("Manish", "Abhishek");
	System.out.println("First name and Last name");
	for(Entry<String,String>e1:m3.entrySet()) {
		System.out.println(e1);
	}
	
}
}
