package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
public static void main(String[] args) {
	Collection<Character> c1=new ArrayList<Character>();
	boolean b1=c1.isEmpty();
	System.out.println(b1);
	c1.add('a');
	c1.add('b');
	c1.add('c');
	c1.add('d');
	c1.add('e');
	System.out.println(c1);
	
	Collection<Character> c2=new ArrayList<Character>();
	c2.add('A');
	c2.add('B');
	c2.add('C');
	c2.add('D');
	c2.add('E');
	System.out.println(c2);
	c2.clear();
	System.out.println(c2);
	//c2.size();
	boolean b2=c2.equals(c2);
	System.out.println(b2);//how to compare 2 collections
	
	boolean b3=c2.contains('A');
	System.out.println(b3);
	boolean b4=c2.contains(c1);
	System.out.println(b4);
}
}
