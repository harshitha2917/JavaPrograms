package map;
//Assignment-44
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BankName_ID {
public static void main(String[] args) {
	Map<String,Integer> m=new HashMap<String,Integer>();
	m.put("SBI", 1111);
	m.put("Canara Bank", 2222);
	m.put("Bank of Baroda", 3333);
	m.put("Karnataka Bank", 4444);
	m.put("Union Bank", 5555);
	m.replace("Bank of Baroda", 3333, 7777);
	
	System.out.println("Bank name with AccountID");
	for(Entry <String, Integer> s2:m.entrySet()) {
		System.out.println(s2);
	}
	
	
	
}
}
