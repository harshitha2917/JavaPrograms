package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection2 {
public static void main(String[] args) {
	Collection<String> c1=new ArrayList<String>();
	c1.add("Akash");
	c1.add("Ravi");
	c1.add("Naveen");
	c1.add("Ajay");
	System.out.println(c1);
	
	Collection<String> c2=new ArrayList<String>();
	c2.add("fizza");
	c2.add("Bhavana");
	c2.add("Dolly");
	c2.add("kanav");
	System.out.println(c2);
	
	c2.addAll(c1);
	System.out.println(c2);
	c2.removeAll(c1);
	System.out.println(c2);
	
	
}
}
