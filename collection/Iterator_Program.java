package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Program {
public static void main(String[] args) {
	List li=new ArrayList();
	li.add("Aakash");
	li.add("Ravi");
	li.add("Naveen");
	li.add("Akshay");
	System.out.println(li);
	
	Iterator i1=li.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}

	
}
}
