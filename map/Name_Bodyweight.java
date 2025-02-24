package map;
//Assignment-44
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Name_Bodyweight {
public static void main(String[] args) {
	Map<String, Integer> m1 = new HashMap<String, Integer>();
	// name and Body weight
	m1.put("Anand", 67);
	m1.put("Akshay", 65);
	m1.put("Harsha", 55);
	m1.put("Monica", 61);
	m1.put("Suppi", 50);
	System.out.println("Name with bodyweight");
	for(Entry<String,Integer> e1:m1.entrySet()) {
		System.out.println(e1);
	}
}
}
