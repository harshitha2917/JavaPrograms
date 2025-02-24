package map;
//Assignment-44
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Program2 {
	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		// Product name with its Quantity
		m1.put("Sugar", 25);
		m1.put("Salt", 15);
		m1.put("Maida", 5);
		m1.put("Wheat", 10);
		m1.put("Rice", 30);
		//1st way
		// System.out.println(m1); or

		//2nd way
		// Set<String> s=m1.keySet(); //return type of keySet is Set of String
		// -gives only product name
		// System.out.println(s);

		//3rd way
		System.out.println("Fetching all keys: ");
		// for each loop
		for (String s1 : m1.keySet()) //print product name
		{
			System.out.println(s1);
		}

		System.out.println("Fetching all values: ");
		for (Integer i1 : m1.values())//print quantity name
		{
			System.out.println(i1);
		}
		System.out.println("Fetching all keys and values: ");
		//4th way
		System.out.println("Fetching all keys and values together: ");
		//The return type of entryset is Set because of unique values
		for(Entry<String,Integer>e2:m1.entrySet())//print name with quantity
			{
		System.out.println(e2);	
		}
		
		//5th way
		System.out.println("Fetching the values in PAIR using Iterator:::: ");
		Set <Entry <String, Integer>> s1=m1.entrySet();
		Iterator <Entry <String, Integer>> i1=	s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}
}
