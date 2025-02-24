package map;

import java.util.HashMap;
import java.util.Map;

public class Map_Program1 {
public static void main(String[] args) 
{
	Map<Integer,String> m2=new HashMap<Integer,String>();
	m2.put(101, "Ram");//Accountno with name
	m2.put(202, "Sita");
	m2.put(303, "Laxman");
	m2.put(404, "Aman");
	m2.put(505, "Krish");
	System.out.println(m2);
	
	Map<Integer,String> m3=new HashMap<Integer,String>();
	m3.putAll(m2);
	System.out.println(m3);
	
	//m3.clear();
	//System.out.println(m3);
	
	//boolean b1=m3.isEmpty();
	//System.out.println(b1);
	
	//m3.remove(1234);
	//m3.remove(2345, "Aman");
	//m3.putIfAbsent(7438, "Laxman");
	//m3.replace(101, "Shyam");//replace accountno with another name
	m3.replace(202, "Sita", "Nithya");
	System.out.println(m3);

}
}
